package com.mr.msprovider.service;

import com.mr.msapi.entity.Dept;

import java.util.List;

public interface DeptService {

    Dept getById(Integer id);

    Integer save(Dept dept);

    List<Dept> list();
}
