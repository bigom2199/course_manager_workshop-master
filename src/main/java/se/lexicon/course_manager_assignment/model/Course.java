package se.lexicon.course_manager_assignment.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Course  implements Serializable {
    private int id;
    private String courseName;
    private LocalDate startDate;
    private int weekDuration;
    private  Collections<Student> Students;
public String courseName() {
    this.courseName = courseName;
    this.startDate= startDate;
    this.Students= Students ;
}

     public int  getId()  {
    return id;
     }
     public void setId(){
    this.id= id;

         public String getCourseName() {
           return courseName  ;
  }
           public String setCourseName(String courseName)  {
              this.courseName= courseName;
     }
       public LocalDate getStartDate(Integer LocalDate){
         return startDate;
         }
         public void setStartDate(LocalDate startDate) {
             this.startDate= startDate;
         }


         }
       }

