package task2;

import java.util.ArrayList;

public class Course {
    private String title;
    private String description;
    private ArrayList<Student> students = new ArrayList<Student>();

    ArrayList<Student> filterYear(int an) {
        ArrayList<Student> result = new ArrayList<Student>();
        for(var student : students) {
            if(student.getYear() == an) {
                result.add(student);
            }
        }
        return result;
    }

    public ArrayList<Student> retArray() {
        return students;
    }

    public void addStudent(Student x) {
        students.add(x);
    }
}