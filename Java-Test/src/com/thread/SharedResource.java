package com.thread;

public class SharedResource {

    boolean isItemPresent = false;

   public synchronized void addItem(){
        isItemPresent =true;
       System.out.println("SharedResource Producer  Thread inside notify all");
       notifyAll();
    }

    public synchronized void consumeItem(){

       System.out.println("SharedResource Consumer Thread inside");
        if(!isItemPresent){
            try{
                System.out.println("SharedResource Consumer Thread wait ()");
               wait();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("SharedResource Consumer Thread complete");
        }
       isItemPresent=false;
    }
}
