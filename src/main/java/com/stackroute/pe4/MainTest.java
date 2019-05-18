package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(10,"aa",22));
        students.add(new Student(20,"aa",23));
        students.add(new Student(50,"bb",21));
        students.add(new Student(11,"cc",22));
        students.add(new Student(12,"dd",22));
        students.add(new Student(1,"aa",21));

        Collections.sort(students, new StudentSorter());
        Iterator iterator=students.iterator();
        while (iterator.hasNext()){
            Student student=(Student)iterator.next();
            System.out.println("Student Id: "+student.getId()+
                    "\tStudent name: "+student.getName()+"\tStudent Age: "+student.getAge());
        }
    }


}
