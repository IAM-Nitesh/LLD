package Day2_accessmodifier1;

import Day2_accessmodifiers.Student;

public class StudentChild extends Student {

    public static void main(String[] args) {

        // Student st = new Student();
        // st.batchname = "Sep-23-Intermediate";
        // not accessible using the object of parent class

        StudentChild s = new StudentChild();

        //s.name = "Nitesh"; -> private not accessible

        s.age = 28;

        //s.psp = 90; -> default not accessible

        s.batchname = "Sep-22-Intermediate";
    }
}