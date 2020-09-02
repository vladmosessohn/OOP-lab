package task2;

import java.util.Objects;

public class Student {
    private String name;
    private int year;

    public int getYear() {
        return year;
    }
    public void setYear(int a) {
        year = a;
    }
    public void setName(String c) {
        name = c;
    }
    public void settersForTask3(int a, String b) {
        name = b;
        year = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return year == student.year &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
