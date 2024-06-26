package com.emmanuelpapa.department.service;

import com.emmanuelpapa.department.entity.Department;
import com.emmanuelpapa.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
