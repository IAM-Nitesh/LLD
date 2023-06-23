package Day6_PrintNo1To100;

public class Client {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i ++) {

            NumberPrinter n = new NumberPrinter(i);

            Thread t = new Thread(n);

            t.start();
        }
    }
}