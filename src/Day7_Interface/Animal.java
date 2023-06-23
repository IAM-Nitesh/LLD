package Day7_Interface;

public interface Animal {

    void run();

    void eat();

    void walk();

    default void sleep(){

        System.out.println("Animal is sleeping");
    }

}
