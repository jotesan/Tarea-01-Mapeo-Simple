package com.sistema.hibernate.tarea01;

import java.util.List;

import com.sistema.hibernate.tarea01.dao.impl.HibernateEmployeeDAO;
import com.sistema.hibernate.tarea01.model.Employee;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1L, "Empleado 1", "empleado1@email.com", 300F);
		Employee employee2 = new Employee(2L, "Empleado 2", "empleado2@email.com", 450F);
		
		HibernateEmployeeDAO hibernateEmployeeDAO = new HibernateEmployeeDAO();
		
		hibernateEmployeeDAO.insert(employee1);
		hibernateEmployeeDAO.insert(employee2);
		
		List<Employee> employees = hibernateEmployeeDAO.selectAll();
		System.out.println(employees);
	}
}
