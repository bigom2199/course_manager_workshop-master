package se.lexicon.course_manager_assignment.model;

import se.lexicon.course_manager_assignment.data.dao.StudentDao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class StudentCollectionRepository implements StudentDao {
    private Collections<Student> Students;
    public StudentCollectionRepository(Collections<Student> student) {
        this.Students = student;
    }


   public Student createStudent(String name,String email,String address) {
    Student.add (new Student);
    return new Student;
   }
   public Collections<Student>findAll() {
        return null;
   }
   public boolean removeStudent(Student student) {
        return false;
   }
          @Override
   public Collections<Student> findByName() {
       List<Student> student = new ArrayList<>() ;
       for (student student : student) {
           if (student.getName () . contains(name)) {
           result.add(Students);
       }
        return  result;
    }
    @Override
        public void Clear() {
        this.Students= new HashSet<>() ;

        }
}