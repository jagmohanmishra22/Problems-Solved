package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test 
{ 
  // Maximum number of threads in thread pool 
 public static final int MAX_T = 3;              

 public static void main(String[] args) throws InterruptedException 
 { 
     // creates five tasks 
     Task r1 = new Task("task 1"); 
     Runnable r2 = new Task("task 2"); 
     Runnable r3 = new Task("task 3"); 
     Runnable r4 = new Task("task 4"); 
     Runnable r5 = new Task("task 5");       
       
     // creates a thread pool with MAX_T no. of  
     // threads as the fixed pool size(Step 2) 
     ExecutorService pool = Executors.newFixedThreadPool(MAX_T);   
      
     // passes the Task objects to the pool to execute (Step 3) 
     pool.execute(r1); 
     //System.out.println("task1 execting");
    Thread.sleep(2000);
     pool.execute(r3);
    // System.out.println("task3 execting");
     pool.execute(r4); 
     pool.execute(r5);  
      
     
     System.out.println("main method");
     // pool shutdown ( Step 4) 
     pool.shutdown();
     System.out.println("End of main method");
     
 } 
} 

