package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.entity.Department;
import com.test.error.DepartmentNotFoundException;

@Service
public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);

	 

}
