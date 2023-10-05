package com.tyss.compose.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tyss.compose.entity.Employee;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String> {

}
