package Day2_constructors;

public class Client {

    public static void main(String[] args) {

        //Student st = new Student();

        Student st = new Student( "Nitesh", 28 , 90.0 ,"Sep-22-intermediate");
        Student st1 = new Student("Kritika",31);
        st1.batchname = "default";
        Student st2 = new Student(st1);


        System.out.println("debug");
    }
}
