package Day1_oops1;

import Day2_accessmodifier1.StudentChild;
import Day2_accessmodifiers.Student;

public class Dummy extends StudentChild{

    public static void main(String[] args) {

        Dummy d  = new Dummy();

        d.batchname = "one"; // protected
        //d.name = "nitesh"; //private
        d.age = 28; // public
        //d.psp = 90.0; // default
        System.out.println("Debug");

    }
}
