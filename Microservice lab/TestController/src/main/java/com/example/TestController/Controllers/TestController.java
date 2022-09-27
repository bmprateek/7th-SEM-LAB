package com.example.TestController.Controllers;

import com.example.TestController.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TestController.model.Employee;

@RestController
public class TestController {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee firstPage() {

        Employee emp = new Employee();
        emp.setName("emp1");
        emp.setDesignation("Developer");
        emp.setEmpId("1");
        emp.setSalary(3000);
        return emp;
    }
    @RequestMapping(value = "/student", method = RequestMethod.GET)

    public Student secondPage() {
       Student stu = new Student();
       stu.setName("adi");
       stu.setUsn("1MS19CS030");
       stu.setCourse("CSE");
       return stu;

    }

}
