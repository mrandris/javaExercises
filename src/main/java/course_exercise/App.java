package course_exercise;

import course_exercise.persons.Person;
import course_exercise.persons.Student;
import course_exercise.persons.Trainer;

import java.sql.Date;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Comparator<Person> comp = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if(p1.getLastName().equals(p2.getLastName()) && p1.hashCode() != p2.hashCode()) {
                    return 1;
                } else {
                    char[] st1 = p1.getLastName().toCharArray();
                    char[] st2 = p2.getLastName().toCharArray();

                    int length;
                    if (st1.length < st2.length) {
                        length = st1.length;
                    } else {
                        length = st2.length;
                    }

                    for (int i = 0; i < length; i++) {
                        if (st1[i] < st2[i]) {
                            return -1;
                        } else if (st1[i] > st2[i]) {
                            return 1;
                        }
                    }
                }
                return 0;
            }
        };

        // students
        Student andris = new Student("Andras", "Nagy", new Date(1983, 5, 9));
        Student alex = new Student("Alex", "Gyorfi", new Date(1970, 1, 1));
        Student ionut = new Student("Ioan", "Salagean", new Date(1986, 1, 1));
        Student tudor = new Student("Tudor", "Groza", new Date(1985, 1, 1));
        Student razvan = new Student("Razvan", "Tomos", new Date(1990, 1, 1));
        razvan.setJavaKnowledge(true);
        Student edith = new Student("Edith", "Tms", new Date(1980, 1, 1));
        Student melania = new Student("Melania", "Paraschivei", new Date(1988, 1, 1));
        Student cristina = new Student("Cristina", "Daniela", new Date(1989, 1, 1));
        Student catalin = new Student("Catalin", "C", new Date(1992, 1, 1));
        Student laurentiu = new Student("Laurentiu", "Daniel", new Date(1993, 1, 1));
        Student teodora = new Student("Teodora", "Stana", new Date(1999, 1, 1));
        teodora.setJavaKnowledge(true);
        Student otilia = new Student("Otilia", "Malomfalean", new Date(1995, 1, 1));
        Student toni = new Student("Antoniu", "A", new Date(1994, 1, 1));
        Student paul = new Student("Paul", "P", new Date(1982, 1, 1));
        Student oana = new Student("Oana", "O", new Date(1991, 1, 1));

        Set<Student> studentSet = new TreeSet<>(comp);
        studentSet.add(andris);
        studentSet.add(alex);
        studentSet.add(tudor);
        studentSet.add(razvan);
        studentSet.add(edith);
        studentSet.add(melania);
        studentSet.add(cristina);
        studentSet.add(catalin);
        studentSet.add(laurentiu);
        studentSet.add(teodora);
        studentSet.add(otilia);
        studentSet.add(toni);
        studentSet.add(paul);
        studentSet.add(oana);
        System.out.println("Student list:");
        for(Student st : studentSet) {
            st.printStudent();
        }
        System.out.println();

        // trainers
        Trainer bogdan = new Trainer("Bogdan", "Marinau", new Date(1988, 1, 1));
        bogdan.setAuthorised(true);
        Trainer lucian = new Trainer("Lucian", "Bredean", new Date(1987, 1, 1));
        lucian.setAuthorised(true);
        Trainer marcel = new Trainer("Marcel", "Bostan", new Date(1990, 1, 1));

        Set<Trainer> trainerSet = new TreeSet<>(comp);
        trainerSet.add(bogdan);
        trainerSet.add(lucian);
        trainerSet.add(marcel);
        System.out.println("Trainer list:");
        for(Trainer tr : trainerSet) {
            tr.printTrainer();
        }
        System.out.println();

        // group
        Group jaf = new Group("Java Advanced Features - JAF");
        Group tdd = new Group("Test Driven Development - TDD");
        Group servlets = new Group("Servlets");
        Group oop = new Group("Object Oriented Programming - OOP");

        List<Group> groupList = new ArrayList<>();
        groupList.add(jaf);
        groupList.add(tdd);
        groupList.add(servlets);
        groupList.add(oop);
        System.out.println("Groups:");
        for(Group gr : groupList) {
            System.out.println("Name: " + gr.getGroupName());
        }

        try {
            jaf.addStudent(andris);
            jaf.addStudent(alex);
            jaf.addStudent(razvan);
            jaf.addStudent(ionut);
            jaf.addStudent(tudor);
            jaf.addStudent(catalin);
        } catch (MaximumNumberOfStudentsReachedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Students of " + jaf.getGroupName());
        for(Student st : jaf.getStudents()) {
            st.printStudent();
        }

    }
}
