/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import java.util.ArrayList;

public class Course {
    Department dept;
    int number; 
    String title, code; 
    ArrayList<Student> classList = new ArrayList<Student>(); 
    public Course(String code, int number, Department dept, String title) {
        this.code=code;
        this.number=number;
        this.dept=dept;
        this.title=title;
    }
    
    public Department getDept() {
        return dept;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getCode() {
        return code;
    }
    public int getNumber(){
        return number;
    }
    
    public String toString() {
        return code+" "+number+" "+title+", "+"Enrollment = "+classList.size();
 }

}
