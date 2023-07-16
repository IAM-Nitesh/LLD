package Day15_Abstract_Static_Final;

public class Client {

    public static void main(String[] args) {

        Student1 s = new Student1(23, 9);
        System.out.println(s.rollno);
        System.out.println(s.psp);
        System.out.println(s.University);
        s.fun();
        s.run();
    }

}
