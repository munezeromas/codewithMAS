package org.example;

public class Developer extends Employee {
    double baseSalary;
    double bonus;
    public Developer(double baseSalary, double bonus) {
        super("MUNEZERO Aline");
        this.baseSalary = baseSalary;
       this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return baseSalary + bonus;
    }
}
