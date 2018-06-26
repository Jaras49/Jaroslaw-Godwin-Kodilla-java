package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CompanyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompanies(String name) throws CompanyFacadeException {
        LOGGER.info("Searching for companies with name: {}", name);

        List<Company> companyBySubstring = companyDao.findCompanyBySubstring(name);

        if (!companyBySubstring.isEmpty()) {
            LOGGER.info("Found {} with name like {}", companyBySubstring.size(), name);
            return companyBySubstring;
        } else {
            LOGGER.error(CompanyFacadeException.ERR_NO_COMPANIES_FOUND);
            throw new CompanyFacadeException(CompanyFacadeException.ERR_NO_COMPANIES_FOUND);
        }
    }

    public List<Employee> findEmployees(String name) throws CompanyFacadeException {
        LOGGER.info("Searching for employees with name: {}", name);

        List<Employee> employeeBySubstring = employeeDao.findEmployeeBySubstring(name);

        if (!employeeBySubstring.isEmpty()) {
            LOGGER.info("Found {} with name like {}", employeeBySubstring.size(), name);
            return employeeBySubstring;
        } else {
            LOGGER.error(CompanyFacadeException.ERR_NO_EMPLOYEES_FOUND);
            throw new CompanyFacadeException(CompanyFacadeException.ERR_NO_EMPLOYEES_FOUND);
        }
    }
}
