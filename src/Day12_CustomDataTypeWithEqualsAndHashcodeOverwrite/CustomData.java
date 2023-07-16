package Day12_CustomDataTypeWithEqualsAndHashcodeOverwrite;

public class CustomData {

    int x;
    int y;
    CustomData(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj){
        CustomData c = (CustomData) obj;
        return this.x == c.x && this.y == c.y;
    }

    public int hashCode(){
        return 0;
    }

}
