package com.company;

public class Main {

    public static void main(String[] args) {

	Employee employee1 = new Staffer("John Lennon", "Soft Engeneer", 1000);
    Staffer employee2 = new Staffer("Paul McCartney", "Soft Engeneer", 1000);

    Employee employee3 = new Contractor("Ringo Starr", "DeVops", 800);
    Contractor employee4 = new Contractor("George Harrison", "QA", 800);

        System.out.println();

    employee1.setBonus(100);
    employee1.calculateSalary();
    employee2.setBonus(300);
    employee2.calculateSalary();
    employee3.setBonus(300);
    employee3.calculateSalary();
    employee4.setBonus(300);
    employee4.calculateSalary();

    Employee[] emplyeeArray = new Employee[4];
        emplyeeArray[0]=employee1;
        emplyeeArray[1]=employee2;
        emplyeeArray[2]=employee3;
        emplyeeArray[3]=employee4;

        for (int i = 0; i <4 ; i++) {
            System.out.println(emplyeeArray[i]);
        }

    }
}
