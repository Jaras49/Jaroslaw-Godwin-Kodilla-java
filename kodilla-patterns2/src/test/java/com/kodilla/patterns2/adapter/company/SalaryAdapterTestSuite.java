package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalaryAdapterTestSuite {

    @Test
    public void testTotalSalary() {

        //Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();

        //When
        double totalSalary = salaryAdapter.totalSalary(workers.getWorkers(), workers.getSalaries());

        //Then
        System.out.println(totalSalary);
        assertEquals(20500, totalSalary, 0);

    }
}