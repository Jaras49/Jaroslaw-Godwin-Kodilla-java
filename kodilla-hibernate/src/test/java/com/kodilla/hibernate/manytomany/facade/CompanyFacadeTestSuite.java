package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTestSuite {

    @Autowired
    private CompanyFacade companyFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void shouldFindCompanies() throws CompanyFacadeException {

        //Given
        Company company = new Company("testCompany");
        Company company1 = new Company("superCompany");
        Company company2 = new Company("workShop");
        companyDao.save(company);
        companyDao.save(company1);
        companyDao.save(company2);

        try {
            //When
            List<Company> comp = companyFacade.findCompanies("Comp");

            //Then
            assertEquals(2, comp.size());
        } finally {
            //Clean up
            companyDao.delete(company);
            companyDao.delete(company1);
            companyDao.delete(company2);
        }
    }

    @Test
    public void shouldFindEmployees() throws CompanyFacadeException {

        //Given
        Employee employee = new Employee("test", "testName");
        Employee employee1 = new Employee("test1", "testname1");
        Employee employee2 = new Employee("ss", "worker");
        employeeDao.save(employee);
        employeeDao.save(employee1);
        employeeDao.save(employee2);

        try {
            //When
            List<Employee> empl = companyFacade.findEmployees("st");

            //Then
            assertEquals(2, empl.size());
        }finally {
            //CleanUp
            employeeDao.delete(employee);
            employeeDao.delete(employee1);
            employeeDao.delete(employee2);
        }

    }
}