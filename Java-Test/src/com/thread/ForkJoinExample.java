package com.thread;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Integer> {
    private int[] arr;
    private int start, end;
    private static final int THRESHOLD = 3; // Minimum size for parallel execution

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        // If task is small, compute directly

        if ((end - start) <= THRESHOLD) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            return sum;
        } else {
            // Split task into two subtasks
            int mid = (start + end) / 2;
            SumTask leftTask = new SumTask(arr, start, mid);
            SumTask rightTask = new SumTask(arr, mid, end);

            // Fork left task (execute in parallel)
            leftTask.fork();
            // Compute right task in current thread
            int rightResult = rightTask.compute();
            // Join left task result
            int leftResult = leftTask.join();

            // Combine results
            return leftResult + rightResult;
        }
    }
}

public class ForkJoinExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(numbers, 0, numbers.length);
        int sum = pool.invoke(task);
        System.out.println("Sum: " + sum);
    }

}
