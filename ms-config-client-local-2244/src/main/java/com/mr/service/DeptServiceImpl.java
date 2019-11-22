package com.mr.service;

import com.mr.dao.DeptDao;
import com.mr.msapi.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;

    @Override
    public Dept getById(Integer id) {
        return deptDao.getById(id);
    }

    @Override
    public Integer save(Dept dept) {
        return deptDao.save(dept);
    }

    @Override
    public List<Dept> list() {
        return deptDao.list();
    }
}
