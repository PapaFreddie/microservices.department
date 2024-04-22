package com.emmanuelpapa.department.controller;

import com.emmanuelpapa.department.entity.Department;
import com.emmanuelpapa.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments/{departmentId}")
    public Department findByDepartmentIdd(@PathVariable("departmentId") Long departmentId){
        return departmentService.findByDepartmentId(departmentId);
    }
}
