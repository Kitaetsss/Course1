package ru.skypro.course1;

public class Employee {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private double salary;
    private int departament;
    private int id;
    private static int counter = 1;

    public Employee(String firstName, String middleName, String lastName, double salary, int departament){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.departament = departament;
        this.id = counter++;
    }

    @Override
    public String toString() {
        return "firstName= " + firstName + ", middleName= " + middleName + ", lastName= " + lastName + ", salary= " + salary + ", departament= " + departament + ", id = " + id;
    }
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartament() {
        return departament;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }
}
