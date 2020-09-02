package task2;

public class Test {
    public static void main(String[] args) {
        Course c1 = new Course();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        s1.setName("Jean");
        s2.setName("Geany");
        s3.setName("Intergalacticu");
        s4.setName("Vulturu");
        s1.setYear(1999);
        s2.setYear(1999);
        s3.setYear(1997);
        s4.setYear(1997);
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.addStudent(s4);

        Student s5 = new Student();
        s5.setName("Jean");
        s5.setYear(1999);
        c1.addStudent(s5);
        System.out.println(s5.equals((s1)));
        for(var x: c1.retArray()) {
            if(x.getYear() == 1997)
                System.out.println(x.toString());
        }
    }
}
