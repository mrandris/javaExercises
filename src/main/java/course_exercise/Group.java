package course_exercise;

import course_exercise.persons.Student;
import course_exercise.persons.Trainer;

import java.util.Comparator;
import java.util.TreeSet;

public class Group {
    private String groupName;
    private Trainer trainer = null;

    Comparator<Student> comp = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            if(s1.getLastName().equals(s2.getLastName()) && s1.hashCode() != s2.hashCode()) {
                return 1;
            } else {
                char[] st1 = s1.getLastName().toCharArray();
                char[] st2 = s2.getLastName().toCharArray();

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

    private TreeSet<Student> students = new TreeSet<>(comp);

    /** getters & setters **/
    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupName() {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setStudents(TreeSet<Student> students) {
        this.students = students;
    }

    public TreeSet<Student> getStudents() {
        return students;
    }

    /** methods **/
    public void addStudent(Student student) throws MaximumNumberOfStudentsReachedException {
        students.add(student);
        if (students.size() >= 5) {
            throw new MaximumNumberOfStudentsReachedException("Maximum number of students for this group is reached");
        }
    }
}

class MaximumNumberOfStudentsReachedException extends Exception {
    public MaximumNumberOfStudentsReachedException(String message) {
        super(message);
    }
}
