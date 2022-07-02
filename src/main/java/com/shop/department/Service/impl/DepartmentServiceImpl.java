package com.shop.department.Service.impl;

import com.shop.department.Entity.Department;
import com.shop.department.Repository.DepartmentRepository;
import com.shop.department.Service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        log.info("Inside DepartmentServiceImpl.saveDepartment.. {{}}" , department);
        return departmentRepository.save(department);
    }

    @Override
    public Department findDepartmentById(Long id) {
        log.info("Inside DepartmentServiceImpl.findDepartmentById.. {}" , id);
        Department department = departmentRepository.getById(id);
        log.info("Department {}" , department);
        return department;
    }
}
