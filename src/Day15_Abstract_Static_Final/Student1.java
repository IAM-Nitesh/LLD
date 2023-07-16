package Day15_Abstract_Static_Final;

public class Student1 extends Student{

    Student1(int rollno, int psp){
        this.rollno = rollno;
        this.psp = psp;
    }

    void walk(){
        System.out.println("inside walk from student 1");
    }
            ;
}
