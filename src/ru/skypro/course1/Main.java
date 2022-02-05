package ru.skypro.course1;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Afanasev", "Dmitry", "Yurevich", 20000.0, 1);
        employees[1] = new Employee("Khairutdinov", "Azamat", "Ramilevich", 23000.0, 1);
        employees[2] = new Employee("Gayanova", "Kristina", "Rayshanovna", 22000.0, 2);
        employees[3] = new Employee("Gaitov", "Ilyas", "Maratovich", 25000, 2);
        employees[4] = new Employee("Eshtuhtarov", "Umid", "Islamovich", 21000, 3);
        employees[5] = new Employee("Ivanov", "Ivan", "Ivanovich", 26000, 3);
        employees[6] = new Employee("Olegov", "Oleg", "Olegovich", 19000, 4);
        employees[7] = new Employee("Alexandrov", "Alexandr", "Alexandrovich", 18000, 4);
        employees[8] = new Employee("Petrov", "Petr", "Petrovich", 24000, 5);
        employees[9] = new Employee("Semenov", "Semen", "Semenovich", 27000, 5);
        allPeople(employees);
        allSalary(employees);
        middleSalary(employees);
        minSalary(employees);
        maxSalary(employees);
        FIO(employees);
    }

    // все сотрудники
    public static void allPeople(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    // сумма затрат
    public static void allSalary(Employee[] employees) {
        int allSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            allSalary += employees[i].getSalary();
        }
        System.out.println("Общая з/п " + allSalary);
    }

    //минимальная зп
    public static void minSalary(Employee[] employees) {
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println(minSalary);
    }

    //максималка
    public static void maxSalary(Employee[] employees) {
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.println(maxSalary);
    }

    //средняя
    public static void middleSalary(Employee[] employees) {
        int middleSalary = 0;
        for (int i = 0; i < employees.length; i++) {
           middleSalary += employees[i].getSalary();
        }
        middleSalary /= 10;
        System.out.println("Cредняя з/п " + middleSalary);
    }
    public static void FIO(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            System.out.println("FirstName = " + employees[i].getFirstName() + " middleName = " + employees[i].getMiddleName() + " lastName = " + employees[i].getLastName());
        }
    }
}
