package com.learn2.service;

import com.learn2.domain.Architect;
import com.learn2.domain.Designer;
import com.learn2.domain.Employee;
import com.learn2.domain.Programmer;

public class NameListService {
    private Employee[] employees;

    public NameListService() {
        for (int i = 0, l = Data.EMPLOYEES.length; i < l; i++) {
            String[] item = Data.EMPLOYEES[i];
            Employee employee = null;

            int id = Integer.parseInt(item[1]);
            int age = Integer.parseInt(item[3]);
            double salary = Double.parseDouble(item[4]);

            switch (item[0]) {
                case "10":
                    employee = new Employee(id, item[2], age, salary);
                    break;
                case "11":
                    employee = new Programmer(id, item[2], age, salary);
                    break;
                case "12":
                    double bonus = Double.parseDouble(item[5]);
                    employee = new Designer(id, item[2], age, salary, bonus);
                    break;
                case "13": {
                    double bonus1 = Double.parseDouble(item[5]);
                    double stock = Double.parseDouble(item[6]);
                    employee = new Architect(id, item[2], age, salary, bonus1, stock);
                    break;
                }
            }

            this.employees[i] = employee;
        }
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0, l = employees.length; i < l; i++) {
            Employee employee = employees[i];
            if (employee.getId() == id) {
                return employee;
            }
        }
        throw new TeamException("未找到成员ID");
    }
}
