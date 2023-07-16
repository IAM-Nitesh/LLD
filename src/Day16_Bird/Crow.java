package Day16_Bird;

public class Crow extends Bird implements Fly{
    @Override
    public void Fly() {
        System.out.println("Crow can fly");
    }
}
