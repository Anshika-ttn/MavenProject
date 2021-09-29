class Student
{
    int rollno;
    String name;

    Student(int r, String n)
    {
        rollno = r;
        name = n;
    }
    Student(Student s)
    {
        System.out.println("Copy Constructor Invoked");
        rollno = s.rollno;
        name = s.name;
    }
}
public class five
{
    public static void main(String[] args)
    {
        Student stu1 = new Student(5,"Tina");
        Student stu2 = new Student(8,"Rahul");
        Student stu3= new Student(stu1);
        Student stu4 = new Student(6,"Ambika");
        System.out.println(stu1.name + " " + stu1.rollno);
        System.out.println(stu2.name + " " + stu2.rollno);
        System.out.println(stu3.name + " " + stu3.rollno);
        System.out.println(stu4.name + " " + stu4.rollno);
    }
}