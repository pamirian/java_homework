package com.company;

public class Staffer extends Employee{
    private final String STATUS = "Staffer";
    private int bonus;

    public Staffer(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    void calculateSalary() {
        salary = salary+bonus;
    }


    @Override
    public String toString() {
        return super.toString()+",\t status: "+STATUS;
    }
}
