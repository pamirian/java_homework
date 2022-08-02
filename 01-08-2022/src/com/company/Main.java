package com.company;

public class Main {

    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivanov_ivan@mailbox.com", "89261112233", 30000, 30);
        employeeArray[1] = new Employee("Petrov Evgeny", "Engineer", "petrov_evgeny@mailbox.com", "89261112244", 35000, 36);
        employeeArray[2] = new Employee("Sidorova Marina", "QA Tester", "sidorova_marina@mailbox.com", "89261112255", 28000, 25);
        employeeArray[3] = new Employee("Vasechkin Petya", "Fullstack developer", "vasechkin_petya@mailbox.com", "89261112266", 40000, 43);
        employeeArray[4] = new Employee("Siroejkin Sergey", "Manager", "siroejkin_sergey@mailbox.com", "89261112277", 36000, 45);

        for (int i = 0; i < employeeArray.length; i++) {
                employeeArray[i].getEmployeeInfo(40);
            }

        }
    }

