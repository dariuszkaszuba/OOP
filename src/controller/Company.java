package controller;

import model.Employee;

public class Company {
    Employee employees[] = new Employee[10];
    int index = 0;

    public void addEmployee(String name, String lastname, String PESEL, String birth_date, String empl_date, double salary_net) {
        Employee e = new Employee(name, lastname, PESEL, birth_date, empl_date, salary_net);

        employees[index] = e;
        index++;
        System.out.println("Dodano pracowika: " + e);
    }

    public void getAllEmployee() {
        System.out.println("Lista pracowników");
        for (int i = 0; i < index; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void main(String[] args) {
        Company c = new Company();
        c.addEmployee("M", "K", "111", "233-43 -", "32-34-4", 2233);
        c.addEmployee("k", "o", "222", "233-43 -", "32-34-4", 2873);
        c.addEmployee("i", "i", "333", "23356-", "3254-4", 288);

        c.getAllEmployee();
        System.out.println("wyszukano: " + c.getByPESEL("333"));
        System.out.println("wyszukano: " + c.getByPESEL("3ded"));
        c.setSalary("333",202020);
        c.getAllEmployee();
    }

    public Employee getByPESEL(String PESEL_search) {
        for (int i = 0; i < index; i++) {
            if (employees[i].PESEL.equals(PESEL_search)) {
                return employees[i];
            }
        }
        return null;
    }

    public void setSalary(String PESEL_search, double newSalary) {
        for (int i = 0; i < index; i++) {
            if (employees[i].PESEL.equals(PESEL_search)) {
                employees[i].salary_net = newSalary;
            }
        }
    }
}
