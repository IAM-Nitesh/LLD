package Day4_MethodOverloading;

public class Student {

    void sayhello (String name){

        System.out.println("hello string "+ name);
    };


    void sayhello (Object name){

        System.out.println("hello object "+ name );
    };
    // Method overloaded due to same singature
//    String sayhello (String name) {
//
//        System.out.println("Hello");
//    return "Hello";
//    };


}
