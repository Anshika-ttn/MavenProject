import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    class Student implements Comparable<Student>
    {
        private String name;
        private int age;
        private int score;

        public Student(String name, int age, int score)
        {
            this.name = name;
            this.age = age;
            this.score = score;
        }
        @Override
        public String toString()
        {
            return "[" + "name = " + name  + ", age = " + age + ", score = " + score + "]\n";
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
        public int getScore(){
            return score;
        }

        public int compareTo(Student o) {
            if(this.getScore() < o.getScore()){
                return 1;
            }else if(this.getScore() > o.getScore()){
                return -1;
            }
            return this.getName().compareTo(o.getName());
        }
    }

    public class five
    {
        public static void main(String[] args)
        {
            Student stu1 = new Student("Jack", 10, 20);
            Student stu2 = new Student("John", 14, 10);
            Student stu3 = new Student("Tina", 15, 14);
            Student stu4 = new Student("Rajesh", 11, 20);
            Student stu5 = new Student("Veena", 12 ,3);
            Student stu6 = new Student("Arun", 9, 10);
            Student stu7 = new Student("Amir", 7, 13);
            Student stu8 = new Student("Krishna",11, 11);
            Student stu9 = new Student("Ram",11, 14);
            Student stu10 = new Student("Sita",12, 12);

            List<Student> s = new ArrayList<>();
            s.add(stu1);
            s.add(stu2);
            s.add(stu3);
            s.add(stu4);
            s.add(stu5);
            s.add(stu6);
            s.add(stu7);
            s.add(stu8);
            s.add(stu9);
            s.add(stu10);

            Collections.sort(s);
            System.out.println(s);
        }
    }

