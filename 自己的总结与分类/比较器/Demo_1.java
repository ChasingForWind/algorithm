package 自己的总结与分类.比较器;


import java.util.Arrays;
import java.util.Comparator;

public class Demo_1 {
    public static class Student {
        public String name;
        public int id;
        public int age;

        public Student(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }
    }


    public static class IdAscendingComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1,Student o2) {
            return o1.id - o2.id;
        }
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("Name : " + student.name + ", Id : " + student.id + ", Age : " + student.age);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("A", 2, 23);
        Student student2 = new Student("B", 3, 21);
        Student student3 = new Student("C", 1, 22);
        Student[] students = new Student[] { student1, student2, student3 };
        Arrays.sort(students,new IdAscendingComparator());
        printStudents(students);
        System.out.println("===========================");


    }
}
