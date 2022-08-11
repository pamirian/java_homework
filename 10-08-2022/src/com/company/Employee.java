package com.company;

abstract class Employee {
    String name;
    String position;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee - " + "name: " + name + ",\t position: " + position +",\t salary: " + salary;
    }

    abstract void calculateSalary();
    abstract void setBonus(int bonus);
}
