package vn.com.tma.taskmanagement.services

import vn.com.tma.taskmanagement.entities.Employee

interface IEmployeeService {
    List<Employee> findAll()
}
