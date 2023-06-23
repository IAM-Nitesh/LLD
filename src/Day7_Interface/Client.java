package Day7_Interface;

public class Client {


    public static void main(String[] args) {

        Animal a = new Dog();

        a.walk();
        a.eat();
        a.sleep();

        // if we want to call the dog bark method then reference has to be of dog since bark is not present in parent animal

        a = new Cat();

        a.walk();
        a.eat();
        a.sleep();
    }

}
