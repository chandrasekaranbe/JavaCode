package com.thread;

import java.util.concurrent.*;

public class Thread1 {

    public static void main(String args[]) {
        System.out.println("Thread main     " + Thread.currentThread().getName());

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 4, 10,
                TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), new CustomThreadFactory(), new CustomRejectHandler());

        poolExecutor.allowCoreThreadTimeOut(true);

        for (int i = 1; i <= 7; i++) {
            poolExecutor.submit(() ->{
                try{
                    Thread.sleep(5000);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                System.out.println("Task Processed By "+Thread.currentThread().getName());
            });
        }
        poolExecutor.shutdown();
    }
}

class  CustomThreadFactory implements ThreadFactory{
   @Override
    public  Thread newThread(Runnable r){
     Thread th= new Thread(r);
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
        return th;
        }
}


class CustomRejectHandler implements  RejectedExecutionHandler{
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor){
        System.out.println("Task Rejected By "+r.toString());
    }
}