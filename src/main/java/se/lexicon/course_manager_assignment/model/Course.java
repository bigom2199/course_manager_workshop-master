package se.lexicon.course_manager_assignment.model;

import java.time.LocalDate;
import java.util.Collections;

public class Course  {
    private int id;
    private String courseName;
    private LocalDate startDate;
    private int weekDuration;
    private  Collections<Student> Students;
public String courseName() {
    this.courseName = courseName;
}

     public int  getId()  {
    return id;
     }
  public String getCourseName() {
    return courseName;
  }
     public void setCourseName()  {
    this.courseName= courseName;
     }
       public LocalDate getStartDate(){

       }
}
