package course_exercise.persons;

import java.sql.Date;

public class Trainer extends Person {
    private boolean isAuthorised;

    /** constructor, getters, setters **/
    public Trainer(String firstName, String lastName, Date birthDate) {
        super(firstName, lastName, birthDate);
    }

    public boolean isAuthorised() {
        return isAuthorised;
    }

    public void setAuthorised(boolean authorised) {
        isAuthorised = authorised;
    }

    /** methods **/
    /** methods **/
    public void printTrainer() {
        System.out.println("Name: " + super.getLastName() + " " + super.getFirstName() + "\tDate of Birth: "
                + super.getBirthDate() + "\tIs authorised: " + isAuthorised);
    }

}
