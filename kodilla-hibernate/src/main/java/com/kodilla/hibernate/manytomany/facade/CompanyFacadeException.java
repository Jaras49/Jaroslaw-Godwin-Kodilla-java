package com.kodilla.hibernate.manytomany.facade;

public class CompanyFacadeException extends Exception {

    public static final String ERR_NO_COMPANIES_FOUND = "There are no companies with specified name";
    public static final String ERR_NO_EMPLOYEES_FOUND = "There are no employees with specified name";

    public CompanyFacadeException(String message) {
        super(message);
    }
}
