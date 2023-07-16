package Day15_2InterfaceWithSameDefaultMethods;

interface B {

    //void run();

    default void fun(){
        System.out.println("inside default of B's fun");
    }
}
