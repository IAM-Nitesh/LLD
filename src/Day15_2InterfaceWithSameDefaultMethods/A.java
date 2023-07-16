package Day15_2InterfaceWithSameDefaultMethods;

interface A {

    //void run();

    default void fun(){
        System.out.println("inside default of A's fun");
    }

}
