package Registration;

import java.util.ArrayList;

public class Student {

    String id,name;
    ArrayList<Course> courses=new ArrayList<Course>(); 

    public Student(String id, String name) {
        this.id=id;
        this.name=name;
    }
    
    public String getId(){
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public void registerFor(Course c) {
         
        boolean alreadyregistered=false;
         for (Course c1 : courses) {
           if(c1.getCode().equals(c.getCode())){
               if(c1.getNumber()==c.getNumber()){
                   alreadyregistered=true;
                }
           }
        }
        if (!alreadyregistered){
            courses.add(c);
            if(!c.getDept().isStudentRegistered(this)){
                c.classList.add(this);
            }
        }
    }
    
    public String toString() {
        return id+" "+name;
    }

    boolean isRegisteredInCourse(Course c) {
        boolean isRegisterd=false;
         for (Course c1 : courses) {
           if(c1.getCode().equalsIgnoreCase(c1.getCode())){
               if(c1.getNumber()==c.getNumber()){
                    isRegisterd=true;
                }
            }
        }
         return isRegisterd;
    }
}    

