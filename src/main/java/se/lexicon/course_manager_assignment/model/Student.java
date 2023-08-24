package se.lexicon.course_manager_assignment.model;

import java.io.Serializable;

public class Student  implements Serializable {
           private int id;
           private String name;
           private String email;
           private String address;
public String Name;
public Student(String name) {
    this.name = name;

}
public Student (String email,String address){
    this.address = address;
    this.email =email;

}


       public String getName() {
    return name;
       }
       public void setName(String name) {
    this.name = name;
       }
       @Override
       public String toString() {
    return name;
       }
       public int getId() {
    return id;
       }
       public String getEmail() {
    return email;
       }

  public void setEmail() {
    this.email =email;
  }
 public String getAddress() {
    return address;

 }

    public void setAddress(){
    this.address=address;
    return address
    }


