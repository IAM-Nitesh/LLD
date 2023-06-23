package Day4_MethodOveriding;

public class Client {

    public static void main(String[] args) {
        A a = new A();
        a.DoSomething("Nitesh");

        a = new B();
        a.DoSomething("Nitesh");

        B b = new B();
        b.DoSomething("Nitesh");

        //b = new A();
        //b.DoSomething("Nitesh");
    }
}
