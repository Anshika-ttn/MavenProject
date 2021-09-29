class Employee {
    String name, city;
    int age;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface ThisInterface {
    Employee getEmployee(String name);
}

public class four {
    public static void main(String[] args) {
        ThisInterface thisInterface = Employee::new;
        System.out.println(thisInterface.getEmployee("Anshika").getName());
    }
}
