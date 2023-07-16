package Day12_CustomDataTypeWithEqualsAndHashcodeOverwrite;

import java.util.HashSet;
import java.util.Set;

public class Client {

    public static void main(String[] args) {

        CustomData c1 = new CustomData(10,20);
        CustomData c2 = new CustomData(10,20);
        CustomData c3 = new CustomData(11,21);
        Set<CustomData> s = new HashSet<>();
        s.add(c1);
        System.out.println(s);
        s.add(c2);
        System.out.println(s);
        s.add(c3);
        System.out.println(s);


        // == will return false for non primitive data type hence above is the implementation of equals
        // and hashcode function overwritten for custom class Customdata

        if (c1 == c2){
            System.out.println("equals");
        }
        else{
            System.out.println("unequal");
        }

    }
}
