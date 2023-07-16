package Day16_Bird;

public class Penguine extends Bird implements Dance {


    @Override
    public void dance() {
        System.out.println("Penguine can dance");
    }
}
