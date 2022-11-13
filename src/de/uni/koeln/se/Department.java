package de.uni.koeln.se;

import java.util.HashSet;
import java.util.Set;

public class Department {

    Department dep = new Department();

    private Set employees;
    private String name;

    public Department() {
        employees = new HashSet();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        employee.setOwner(this);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
        employee.setOwner(null);
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
