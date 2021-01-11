package vn.com.tma.taskmanagement.repositories

import org.springframework.data.jpa.repository.JpaRepository
import vn.com.tma.taskmanagement.entities.Employee

interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
