/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import java.util.ArrayList;

public class Department {
    String name,id; 
    ArrayList<Course> courseList=new ArrayList<Course>(); 
    ArrayList<Student> registerList=new ArrayList<Student>(); 
    
    public Department(String name, String id) {
        this.name=name;
        this.id=id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    public String toString() {
        return id+": "+courseList.size()+" courses, "+registerList.size()+" students";
    }

    public void offerCourse(Course c) {
        courseList.add(c);
    }

    void printCoursesOffered() {
        for (int i=0; i <courseList.size();i++) {
            System.out.println(courseList.get(i).toString());
        }
    }

    void printStudentsByName() {
        for (Course c : courseList) {
            for (Student s : c.classList) {
                System.out.println(s.toString());
            }
        }
    }

    boolean isStudentRegistered(Student student) {
        boolean isRegisterd=false;
         for (Course c : courseList) {
            for (Student s : c.classList) {
                if(s.getId().equals(student.getId())){
                    isRegisterd=true;
                }
            }
        }
         return isRegisterd;
    }
    
    ArrayList<Student> studentsRegisteredInCourse(int code){
        
        for (Course c : courseList) {
            if (c.getNumber()==code){
                for (Student s : c.classList) {            
                    registerList.add(s);
                }
            }
        }
        return registerList;
    }
    
    void printStudentsRegisteredInCourse(int i) {
         for (Student s : studentsRegisteredInCourse(i)) {
            System.out.println(s.getId()+" "+s.getName());
         }
        
    }

    String largestCourse() {
        int max=0;
        String maxCourse=null;
        for (Course c : courseList) {
                if(c.classList.size()>=max){
                     max=c.classList.size();
                     maxCourse="";
                     maxCourse=c.toString();
                }
            
        }
        return maxCourse;
    }
}

