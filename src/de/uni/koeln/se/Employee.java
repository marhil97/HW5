package de.uni.koeln.se;

public class Employee {

    Employee emp = new Employee();

    private String name;
    private int employees;
    private Department owner;

    public Employee() {

    }

    public void setOwner(Department newOwner) {
        if (owner != newOwner) {
            Department old = owner;
            owner = newOwner;
            if (newOwner != null) {
                newOwner.addEmployee(this);
                if (old != null) {
                    old.removeEmployee(this);
                }
            }
        }
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public Employee(Employee emp) {
        this.emp = emp;
    }
}
