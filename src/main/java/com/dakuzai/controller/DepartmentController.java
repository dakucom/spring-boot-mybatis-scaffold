package com.dakuzai.controller;

import com.dakuzai.mapper.DepartmentMapper;
import com.dakuzai.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: spring-boot-mybatis-scaffold
 * @description: 部门controller
 * @author: dakuzai
 * @create: 2020-03-23 14:49
 */
@RestController
public class DepartmentController {
    @Autowired
    DepartmentMapper departmentMapper;

    @RequestMapping(value = "/getDepartments", method = RequestMethod.GET)
    public List<Department> getDepartments() {
        List<Department> departments = departmentMapper.getDepartments();
        return departments;
    }

    @RequestMapping(value = "/getDepartmentById/{id}", method = RequestMethod.GET)
    public Department getDepartmentById(@PathVariable Integer id) {
        Department department = departmentMapper.getDepartmentById(id);
        return department;
    }
}
