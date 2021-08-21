package hackerrank;

/*
 * Solution by https://github.com/yak-fumblepack
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Java_sort {

    static class Student {
        private final int id;
        private final String fname;
        private final double cgpa;
        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Student> studentList = new ArrayList<Student>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String fname = sc.next();
            double cgpa = sc.nextDouble();

            Student student = new Student(id, fname, cgpa);

            studentList.add(student);
        }

        Collections.sort(studentList, Comparator
                .comparing(Student::getCgpa)
                .reversed()
                .thenComparing(Student::getFname)
                .thenComparing(Student::getId)
        );

        for (Student student: studentList) {
            System.out.println(student.getFname());
        }


    }

}
