package Day8_Callable_mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable <List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService executor;
    MergeSorter(List<Integer> arrayToSort, ExecutorService executor){
        this.arrayToSort = arrayToSort;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception{

        if (arrayToSort.size() <= 1){
            System.out.println("DEBUG");
            return arrayToSort;
        }

        int mid = arrayToSort.size()/2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for (int i = 0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }

        for (int i = mid;i<arrayToSort.size();i++) {
            rightArray.add(arrayToSort.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftArray, executor);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray, executor);



        //ExecutorService executor = Executors.newCachedThreadPool(); // pool -2

        //Future<List<Integer>> leftSortedArrayFuture = leftMergeSorter.call();
        //Future<List<Integer>> rightSortedArrayFuture = rightMergeSorter.call();

        Future<List<Integer>> leftSortedArrayFuture = executor.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedArrayFuture = executor.submit(rightMergeSorter);

        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();

        List<Integer> SortedArray = new ArrayList<>();

        int i = 0, j= 0;
        while (i<leftSortedArray.size() && j<rightSortedArray.size()){
            if (leftSortedArray.get(i)< rightSortedArray.get(j)) {
                SortedArray.add(leftSortedArray.get(i));
                i++;
            }
            else{
                SortedArray.add(rightSortedArray.get(j));
                j++;
            }
            }

        while (i<leftSortedArray.size()){
            SortedArray.add(leftSortedArray.get(i));
            i++;
        }
          while (j<rightSortedArray.size()){
            SortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return SortedArray;
    }

}
