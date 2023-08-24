package se.lexicon.course_manager_assignment.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class StudentCollectionRepository {
    private Collections<Student> Students;
    public StudentCollectionRepository(Collections<Student> student) {
        this.Students = student;
    }


   public Student createStudent(String name,String email,String address) {
    Student.add (new Student);
    return new Student;
   }
          @Override
   public Collections<Student> findByName() {
       List<Student> student = new ArrayList<>() ;
       for (student student : student) {
           if (student.getName ()) ;
           result.add(Students);
       }
       return result;
    }
    @Override
        public void Clear() {
        this.Students= Students;
        Students.clear() ;
        }

}