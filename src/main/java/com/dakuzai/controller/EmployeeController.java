package com.dakuzai.controller;

import com.dakuzai.mapper.EmployeeMapper;
import com.dakuzai.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @program: spring-boot-mybatis-scaffold
 * @description: 职工controller
 * @author: dakuzai
 * @create: 2020-03-23 18:51
 */
@RestController
public class EmployeeController {
    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees() {
        return employeeMapper.getEmployees();
    }

    @GetMapping("/saveEmployee")
    public int saveEmployee() {
        Employee employee = new Employee();
        employee.setLastName("dakuzai");
        employee.setEmail("24736743@qq.com");
        employee.setGender(1);
        employee.setDepartment(101);
        employee.setBirth(new Date());
        return employeeMapper.saveEmployee(employee);
    }

    @GetMapping("/deleteEmployeeById/{id}")
    public int deleteEmployeeById(@PathVariable("id") Integer id) {
        return employeeMapper.deleteEmployeeById(id);
    }

    @GetMapping("/getEmployeeById/{id}")
    public Employee getEmployeeById(@PathVariable("id") Integer id) {
        return employeeMapper.getEmployeeById(id);
    }
}
