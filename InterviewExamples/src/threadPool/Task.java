package threadPool; 

//Task class to be executed (Step 1) 
class Task implements Runnable    
{ 
 private String name; 
   
 public Task(String s) 
 { 
     name = s; 
 } 
   
 // Prints task name and sleeps for 1s 
 // This Whole process is repeated 5 times 
 
 public void run() 
 { 
    for(int i=0;i<3;i++) 
    {
    	System.out.println(name+" complete");
    }
	 
 } 
} 
