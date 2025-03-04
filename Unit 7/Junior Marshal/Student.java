//Unit 7 Lab 2
//Junior Marshals
//Alisha Wheeler - period 2

import java.util.*;
import java.io.*;

public class Student implements Comparable<Student>{
    String name = "";
    double gpa = 0;

    public Student(String n, double g){
        name = n;
        gpa = g;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa); 
    }
}
