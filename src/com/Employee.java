/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author duyta
 */
public class Employee {

    String code = "", name = ""; // data
    int salary = 0;

    //contructors
    public Employee() {

    }

    public Employee(String c, String n, int s) {
        code = c;
        name = n;
        salary = s;
    }

    // Getter Setter
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Matching 2 employee objects
    public boolean equals(Employee emp) {
        return emp.getCode().equals(this.getCode())
                && emp.getName().equals(this.getName())
                && emp.getSalary() == this.getSalary();
    }

    @Override
    public String toString() {
        return code + "\t" + name + "\t" + salary;
    }

}
