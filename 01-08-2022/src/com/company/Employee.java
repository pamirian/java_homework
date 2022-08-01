package com.company;

public class Employee {
    String name, jobTitle, email, phone;
    int salary;
    int age;

    // Параметризированный конструктор
    Employee(String name, String jobTitle, String email, String phone, int salary, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // метод, который выводит информацию об объекте в консоль.
    void getEmployeeInfo() {
        if (this.age > 40) {
            System.out.println("Name: " + this.name + ", Position: " + this.jobTitle + ", Email: " + this.email + ", Phone:" + this.phone + ", Salary: " + salary + ", Age: " + age);
        }
    }

}
