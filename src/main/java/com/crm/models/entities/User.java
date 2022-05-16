package com.crm.models.entities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.websocket.Decoder.Text;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
public class User implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_company;
    private String name;
    private String email;
    private String mobile_phone;
    private String email_verified_at;
    private String password;
    private String role;
    private String remember_token;
    private String api_token;
    private Date created_at;
    private Date updated_at;


    public User() {
    }

   
    public User(Long id, Long id_company, String name, String email, String mobile_phone, String email_verified_at,
            String password, String role, String remember_token, String api_token, Date created_at, Date updated_at) {
        this.id = id;
        this.id_company = id_company;
        this.name = name;
        this.email = email;
        this.mobile_phone = mobile_phone;
        this.email_verified_at = email_verified_at;
        this.password = password;
        this.role = role;
        this.remember_token = remember_token;
        this.api_token = api_token;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Long getId_company() {
        return id_company;
    }


    public void setId_company(Long id_company) {
        this.id_company = id_company;
    }


    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getMobile_phone() {
        return mobile_phone;
    }


    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }


    public String getEmail_verified_at() {
        return email_verified_at;
    }


    public void setEmail_verified_at(String email_verified_at) {
        this.email_verified_at = email_verified_at;
    }


    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }

    public String getRemember_token() {
        return remember_token;
    }


    public void setRemember_token(String remember_token) {
        this.remember_token = remember_token;
    }


    public String getApi_token() {
        return api_token;
    }


    public void setApi_token(String api_token) {
        this.api_token = api_token;
    }


    public Date getCreated_at() {
        return created_at;
    }


    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }


    public Date getUpdated_at() {
        return updated_at;
    }


    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role);
        // TODO Auto-generated method stub
        return Collections.singletonList(authority);
    }


    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return password;
    }


    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return email;
    }


    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }


    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }


    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }


    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }



    

    


    
}
