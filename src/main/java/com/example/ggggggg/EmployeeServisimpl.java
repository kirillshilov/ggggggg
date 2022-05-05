package com.example.ggggggg;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServisimpl implements EmployeeServis {
    public final Employee[] employee = new Employee[10];

    @Override
    public Employee addEmployee(String firstName, String lastName) {
        int d = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].firstName.equalsIgnoreCase(firstName) && employee[i].lastName.equalsIgnoreCase(lastName)) {
                throw new AlreadyHas();
            }
        }
        for (int i = 0; ; i++) {
            if (i >= employee.length) {
                throw new OutOfBounds();
            } else if (employee[i] == null) {
                employee[i] = new Employee(firstName, lastName);
                d = i;
                break;
            }
        }
        return employee[d];
    }

    @Override
    public Employee deleteEmployee(String firstName, String lastName) {
        Employee employee1 = new Employee(firstName, lastName);
        for (int i = 0; ; i++) {
            if (employee[i] != null && employee[i].firstName.equalsIgnoreCase(employee1.firstName) && employee[i].lastName.equalsIgnoreCase(employee1.lastName)) {
                employee[i] = null;
                return employee1;
            } else if (i >= employee.length) {

            } else {
                throw new NotFound();
            }
        }
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        Employee employee1 = new Employee(firstName, lastName);
        for (int i = 0; ; i++) {
            if (employee[i] != null && employee[i].firstName.equalsIgnoreCase(employee1.firstName) && employee[i].lastName.equalsIgnoreCase(employee1.lastName)) {
                return employee1;
            } else if (i >= employee.length) {
                throw new NotFound();
            } else {
                throw new NotFound();
            }
        }
    }
}












