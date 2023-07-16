package Day15_Abstract_Static_Final;

public abstract class Student {

    int rollno; // simple attributes or object level attributes
    int psp;   // simple attributes or object level attributes

    final static String University = "IP";  // static attributes or class level attributes

    // object level method can access static and non static attributes
    void fun(){
        System.out.println("inside fun");
        System.out.println("value of simple attriobute:"+rollno);
        System.out.println("value of static attribute:"+University);
    }

    // class level method can access static attributes only and not non static attributes as these are created at runtime and not compile time
    static void run(){
        System.out.println("inside run");
        //System.out.println("value of simple attriobute:"+rollno);    // not able to access object level attribute by static method
        System.out.println("value of static attribute:"+University);
    };

    abstract void walk();
}
