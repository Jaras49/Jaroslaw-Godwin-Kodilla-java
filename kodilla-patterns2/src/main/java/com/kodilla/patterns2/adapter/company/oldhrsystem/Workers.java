package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {

    private String[][] workers = {
            {"67896525423", "John", "Smith"},
            {"55984523585", "Irvine", "Kineas"},
            {"21459672912", "Jessie", "Pinkman"},
            {"61281230123", "Walter", "White"},
            {"90183128743", "Clara", "Lanson"}
    };

    private double[] salaries = {
            4200,
            5500,
            6300,
            2000,
            2500
    };

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
