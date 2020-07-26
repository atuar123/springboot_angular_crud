package com.ctechbd.springboot_angular_crud.Repository;

import com.ctechbd.springboot_angular_crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
