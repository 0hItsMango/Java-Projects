//Unit 7 Lab 2
//Junior Marshals
//Alisha Wheeler - period 2

import java.util.*;
import java.io.*;

public class JuniorRecords{
    List<Student> studentList = new ArrayList<>();
    List<Student> juniorMarshalList = new ArrayList<>();
    
    public void addStudent(Student x){
        studentList.add(x);
        Collections.sort(studentList,Collections.reverseOrder());
        juniorMarshalList.clear();

        for(int i=0; i<studentList.size(); i++){
            if(studentList.get(i).gpa >= 3.75 && juniorMarshalList.size()<10){
                juniorMarshalList.add(studentList.get(i));

                if(juniorMarshalList.size()==10){
                    for(int j=i+1; j<studentList.size(); j++){
                        if(studentList.get(j)==studentList.get(j-1)){
                            juniorMarshalList.add(studentList.get(j));
                        }
                        else{
                            break;
                        }
                    }
                }
            }
        }
    }
    public void printJuniorMarshals(){
        System.out.println("Junior Marshals:");
        for(int i=0; i<juniorMarshalList.size(); i++){
            System.out.println("#" + (i+1) + ": " + juniorMarshalList.get(i).name + ", GPA: " + juniorMarshalList.get(i).gpa);
        }
    }
    public void printAll(){
        System.out.println("All Students:");
        for(int i=0; i<studentList.size(); i++){
            System.out.println(studentList.get(i).name + ", GPA: " + studentList.get(i).gpa);
        }
    } 
}