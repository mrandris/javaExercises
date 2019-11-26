package course_exercise.persons;

import java.sql.Date;

public class Student extends Person {
    private boolean hasJavaKnowledge;

    /** constructor, getters, setters **/
    public Student(String firstName, String lastName, Date birthDate) {
        super(firstName, lastName, birthDate);
    }

    public boolean hasJavaKnowledge() {
        return hasJavaKnowledge;
    }

    public void setJavaKnowledge(boolean hasJavaKnowledge) {
        this.hasJavaKnowledge = hasJavaKnowledge;
    }

    /** methods **/
    public void printStudent() {
        System.out.println("Name: " + super.getLastName() + " " + super.getFirstName() + "\tDate of Birth: "
                + super.getBirthDate() + "\tHas Java knowledge: " + hasJavaKnowledge);
    }


}
