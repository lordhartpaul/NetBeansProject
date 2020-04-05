package com.sunnsme.MyApi.Repository;

import com.sunnsme.MyApi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    public Employee findOne(Long empid);

}
