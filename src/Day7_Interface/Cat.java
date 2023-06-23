package Day7_Interface;

public class Cat implements Animal{
    @Override
    public void run() {
        System.out.println("Cat is running");
    }
    @Override
    public void eat() {
       System.out.println("Cat is eating");
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }

    public void meow(){
        System.out.print("Meow");
    }

    public void sleep(){
        System.out.print("cat is sleeping");
    };
}
