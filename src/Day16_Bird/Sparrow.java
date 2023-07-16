package Day16_Bird;

public class Sparrow extends Bird implements Fly, Dance{

    @Override
    public void dance() {
        System.out.println("Sparrow can dance");
    }

    @Override
    public void Fly() {
        System.out.println("Sparrow can fly");
    }
}
