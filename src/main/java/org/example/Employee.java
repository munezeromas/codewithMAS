package org.example;

abstract class Employee {
    abstract double calculateSalary();
    String name;
    public Employee(String name) {
        this.name = name;
    }

}
