package com.crm.models.repos;

import java.util.List;

import com.crm.request.UpdateStatus;
import com.crm.response.ResponseProcess;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ContactRepo {

    @Select("SELECT contacts.* , status.name_status, users.name as name_user, users.id_parent, users.id_company, companies.name_company FROM contacts INNER JOIN users ON (contacts.id_sales = users.id) INNER JOIN companies ON (users.id_company = companies.id) INNER JOIN status ON (contacts.id_status = status.id) where contacts.id_contact_type = #{process}")
    List<ResponseProcess> contactProcess(int process);
    
    @Update("update contacts set id_contact_type=2, id_status=5, task_prospecting=#{task_prospecting}, date_prospecting=#{date_prospecting}, mobile_phone_contact=#{mobile_phone_contact} where id=#{id}")
    int updateProToAppr(ResponseProcess responseProcess);

    @Update("update contacts set id_contact_type=5, date_status=NOW() where id=#{id}")
    int updatePreToClo(ResponseProcess responseProcess);

    @Update("update contacts set id_contact_type=4, task_approaching=#{task_approaching}, date_approaching=#{date_approaching}, date_status=NOW() where id=#{id}")
    int updateAppToPresen(ResponseProcess responseProcess);

    @Update("update contacts set id_contact_type=1, date_status=NOW(), id_status=#{id_status} where id=#{id}")
    int updateAppToPro(UpdateStatus UpdateStatus);

    @Update("update contacts set date_status=NOW(), notes_contact=#{notes}, id_status=#{id_status} where id=#{id}")
    int changeStatus(UpdateStatus updateStatus);
}


