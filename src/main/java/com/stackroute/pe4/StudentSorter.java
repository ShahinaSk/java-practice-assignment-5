package com.stackroute.pe4;

import java.util.Comparator;

public class StudentSorter implements Comparator {

    /*Sort the list based on their age in decreasing order, for student having
same age, sort based on their name.
f. For students having same name and age, sort them according to their ID*/


    @Override
    public int compare(Object o1, Object o2) {
        Student student1=(Student)o1;
        Student student2=(Student)o2;
        if (student1.getAge()>student2.getAge()){
            return 1;
        }else if (student1.getAge()<student2.getAge()){
            return -1;
        }else {
            int result=student1.getName().compareTo(student2.getName());
            if (result>0){
                return 1;
            }else if (result<0){
                return -1;
            }else{
                if (student1.getId()>student2.getId()){
                    return 1;
                }else {
                    return 0;
                }
            }
        }
    }
}
