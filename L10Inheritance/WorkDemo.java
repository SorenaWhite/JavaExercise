package L10Inheritance;

class Employee {
    String name;
    protected int salary;

    Employee (String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    int getSalary() {
        return salary;
    }

    void raiseSalary(int r) {
        salary+=r;
    }
}

class Manager extends Employee {
    private int bonus;
    Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    void setBonus(int b) {
        bonus = b;
    }
    int getBonus() {
        return bonus;
    }
    int getSalary() {
        return super.getSalary() + bonus;
    }
}

public class WorkDemo {
    public static void main (String [] args) {
        Employee [] all = new Employee[10];
        all[0]= new Manager("name", 10000, 20);
        for (int i=1; i<10; i++) {
            all[i]=new Employee ("name", 10000);
        }
        int sum = 0;
        for (int i=0; i<10; i++) {
            sum+= all[i].getSalary();
        }
        System.out.println(sum);
    }
}
