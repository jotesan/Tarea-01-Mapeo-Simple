package com.sistema.hibernate.tarea01.dao;

import java.util.List;

import com.sistema.hibernate.tarea01.model.Employee;

public interface EmployeeDAO {

	public Employee selectById(Long id);

	public List<Employee> selectAll();

	public void insert(Employee employee);

	public void update(Employee employee);

	public void delete(Employee employee);
}
