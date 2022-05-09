package com.crm.models.repos;
import java.util.List;

import com.crm.models.entities.Product;
import com.crm.models.entities.Status;
import com.crm.models.entities.User;
import com.crm.response.ResponseProcess;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BatisRepo {

    @Select("select * from status where id_contact_type=#{type}")
    List<Status> findStatusByContactType(String type);

    @Select("select * from products where id_contact=#{type}")
    List<Product> findProductByIdContact(String id);

    @Select("select * from users where email=#{email}")
    User findUserByEmail(String email);
}
