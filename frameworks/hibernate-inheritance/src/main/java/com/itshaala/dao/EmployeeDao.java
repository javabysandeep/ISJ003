package com.itshaala.dao;

import com.itshaala.configuration.HibernateConfigurationUtil;
import com.itshaala.model.ContractEmployee;
import com.itshaala.model.Employee;
import com.itshaala.model.FullTimeEmployee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeDao {
    static public void addEmployee(Employee employee) {
        Session session = HibernateConfigurationUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        System.out.println("Employee Added Successfully");
    }

    static public List<Employee> getAllEmployees() {
        Session session = HibernateConfigurationUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from employee ");
        List<Employee> employeeList = query.list();
        return employeeList;
    }

    public static void main(String[] args) {
        /*Employee employee = Employee.builder()
                .employeeId(1)
                .employeeName("Vaibhav")
                .employeeAddress("Shirdi")
                .build();*/

        /*FullTimeEmployee employee = new FullTimeEmployee();
        employee.setEmployeeId(1);
        employee.setEmployeeName("Sachin");
        employee.setEmployeeAddress("Pune");
        employee.setSalary(10000);*/

        /*ContractEmployee employee = new ContractEmployee();
        employee.setEmployeeId(2);
        employee.setEmployeeName("Gaurav");
        employee.setEmployeeAddress("Uganda");
        employee.setBillAmount(10000);
        addEmployee(employee);*/

        List<Employee> employeeList = getAllEmployees();
        employeeList.forEach(System.out::println);
    }
}
