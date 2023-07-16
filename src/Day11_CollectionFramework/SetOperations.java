package Day11_CollectionFramework;

import java.util.*;

public class SetOperations {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        System.out.println(set.size());
        set.add(20);
        System.out.println(set.size());
        set.add(30);
        System.out.println(set.size());
        set.add(30);
        System.out.println(set.size());
        set.remove(10);
        System.out.println(set.size());


        /*

        Some of the commonly used methods of the Collection interface that's also available in the Set interface are:

        add() - adds the specified element to the set
        addAll() - adds all the elements of the specified collection to the set
        iterator() - returns an iterator that can be used to access elements of the set sequentially
        remove() - removes the specified element from the set
        removeAll() - removes all the elements from the set that is present in another specified set
        retainAll() - retains all the elements in the set that are also present in another specified set
        clear() - removes all the elements from the set
        size() - returns the length (number of elements) of the set
        toArray() - returns an array containing all the elements of the set
        contains() - returns true if the set contains the specified element
        containsAll() - returns true if the set contains all the elements of the specified collection
        hashCode() - returns a hash code value (address of the element in the set)

         */

    }

}
