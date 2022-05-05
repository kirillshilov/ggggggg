package com.example.ggggggg;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServis {
    private final Employee[] employee = new Employee[10];


    public Employee addEmployee(String firstName, String lastName) {
        Employee employee1 = new Employee(firstName, lastName);
        int d = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].equals(employee1)) {
                throw new AlreadyHasException();
            }
        }
        for (int i = 0; ; i++) {
            if (i >= employee.length) {
                throw new OutOfBoundsException();
            } else if (employee[i] == null) {
                employee[i] = new Employee(firstName, lastName);
                d = i;
                break;
            }
        }
        return employee[d];
    }


    public Employee deleteEmployee(String firstName, String lastName) {
        Employee employee1 = new Employee(firstName, lastName);
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].equals(employee1)) {
                employee[i] = null;
                return employee1;
            }
        }
        throw new NotFoundException();
    }


    public Employee findEmployee(String firstName, String lastName) {
        Employee employee1 = new Employee(firstName, lastName);
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].equals(employee1)) {
                return employee1;
            }
        }
        throw new NotFoundException();
    }
}












