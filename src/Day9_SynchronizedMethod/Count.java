package Day9_SynchronizedMethod;

public class Count {

    private int value =0;

    public synchronized void incrementval(int i){
        value += i;
    }

    public int printval(){
        return value;
    }
}
