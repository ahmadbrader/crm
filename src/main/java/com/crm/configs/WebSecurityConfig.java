package com.crm.configs;

import java.net.http.HttpRequest;
import java.util.HashMap;
import java.util.Map;

import com.crm.services.JwtUserDetailsService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.catalina.authenticator.SpnegoAuthenticator.AuthenticateAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Autowired
    JwtUserDetailsService userService;

    @Autowired
    JwtRequestFilter jwtRequestFilter;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests().antMatchers("/api/user/register").permitAll()
            .antMatchers("/api/user/login").permitAll()
            .antMatchers("/swagger-ui/**").permitAll()
            .antMatchers("/v3/api-docs/**").permitAll()
            .anyRequest().fullyAuthenticated()
            .and().exceptionHandling().authenticationEntryPoint((request, response, authException) -> {
                Map<String, Object> responseMap = new HashMap<>();
                ObjectMapper mapper = new ObjectMapper();
                response.setStatus(401);
                responseMap.put("error", true);
                responseMap.put("message", "Unauthorized");
                response.setHeader("content-type", "application/json");
                String responseMsg = mapper.writeValueAsString(responseMap);
                response.getWriter().write(responseMsg);
            }).and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);;
        http.cors();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
    }

    // @Override
    // protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    //     auth.authenticationProvider(daoAuthenticationProvider());
    // }

    // @Bean
    // public DaoAuthenticationProvider daoAuthenticationProvider() {
    //     DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
    //     provider.setPasswordEncoder(bCryptPasswordEncoder);
    //     provider.setUserDetailsService(userService);
    //     return provider;
    // }
}
