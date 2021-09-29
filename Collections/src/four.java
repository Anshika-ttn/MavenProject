import java.util.*;
class Employee implements Comparable<Employee>
{
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString()
    {
        return "[" + "name = " + name  + ", age = " + age + ", salary = " + salary + "]\n";
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSalary(){
        return salary;
    }

    public int compareTo(Employee o) {
        return o.getSalary()- this.salary;
    }
}

public class four
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Jack", 20, 2000);
        Employee emp2 = new Employee("John", 34, 10000);
        Employee emp3 = new Employee("Tina", 29, 4500);
        Employee emp4 = new Employee("Rajesh", 50, 6890);
        Employee emp5 = new Employee("Veena", 46, 20490);
        Employee emp6 = new Employee("Rupali", 37, 1020);
        Employee emp7 = new Employee("Amir", 25, 5003);

        List<Employee> e = new ArrayList<>();
        e.add(emp1);
        e.add(emp2);
        e.add(emp3);
        e.add(emp4);
        e.add(emp5);
        e.add(emp6);
        e.add(emp7);

        Collections.sort(e);
        System.out.println(e);
    }
}