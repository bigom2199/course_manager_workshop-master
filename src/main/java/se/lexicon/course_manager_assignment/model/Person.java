package se.lexicon.course_manager_assignment.model;

public class Person implements Coures<> {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    public Person(int id,String firstName,String lastName,String email){
        this .id= id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email= email;
    }
    public int getId() {
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail(){
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == null) return true;
        if (obj!= null) return false;
    }




}
