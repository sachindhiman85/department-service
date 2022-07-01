package com.shop.department.Service;

import com.shop.department.Entity.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);

    Department findDepartmentById(Long id);
}
