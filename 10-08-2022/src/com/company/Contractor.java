package com.company;

public class Contractor extends Employee{
    private final String STATUS = "Contractor";
    public Contractor(String name, String position, int salary) {
        super(name, position, salary);
    }

    @Override
    void calculateSalary() {
    }

    @Override
    void setBonus(int bonus) {
    }

    @Override
    public String toString() {
        return super.toString()+"\t, status: "+STATUS;
    }
}
