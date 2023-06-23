package Day8_Callable_mergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> arrayToSort = List.of(4,3,2,7,5,8);

        ExecutorService executor = Executors.newCachedThreadPool(); // POOL 1

        MergeSorter mergeSorters = new MergeSorter(arrayToSort, executor);


        Future<List<Integer>> sortedArrayFuture = executor.submit(mergeSorters);

        List<Integer> sortedArray = sortedArrayFuture.get();

        System.out.println(sortedArray);

        executor.shutdown();
    }

}
