package com.mr.msprovider.dao;

import com.mr.msapi.entity.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptDao {

    @Select({"select id, dept_name deptName, dept_desc deptDesc from dept where id=#{id}"})
    Dept getById(Integer id);

    @Insert({" insert into dept (dept_name, dept_desc) values(#{deptName}, #{deptDesc})"})
    @Options(keyColumn = "id", keyProperty = "id",useGeneratedKeys = true)
    Integer save(Dept dept);

    @Select({"select id, dept_name deptName, dept_desc deptDesc from dept"})
    List<Dept> list();

}
