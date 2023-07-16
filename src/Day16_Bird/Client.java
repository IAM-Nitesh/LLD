package Day16_Bird;

public class Client {
    public static void main(String[] args) {

        Sparrow s = new Sparrow();
        s.age = 2;
        s.name = "Sparrrow";
        s.wings = 2;
        System.out.println("age: "+ s.age+ " name: "+ s.name + " wings: "+s.wings);
        s.Fly();
        s.dance();
        s.eat();

        Penguine p = new Penguine();
        p.age = 1;
        p.name = "Penguine";
        p.wings = 2;
        System.out.println("age: "+ p.age+ " name: "+ p.name + " wings: "+p.wings);
        p.dance();
        p.eat();

        Crow c = new Crow();
        c.age = 3;
        c.name = "Crow";
        c.wings = 2;
        System.out.println("age: "+ c.age+ " name: "+ c.name + " wings: "+c.wings);
        c.Fly();
        c.eat();


    }

}
