package PrintEvenOdd;

class TaskEvenOdd  implements Runnable{
 
    public Printer print;
    private boolean isEvenNumberToStartWith;
	
    public TaskEvenOdd(  Printer print,  boolean isEvenNumberToStartWith) {
		
		this.isEvenNumberToStartWith = isEvenNumberToStartWith;
		 this.print=print;
	}
    
    @Override
    public void run() {
       int number = isEvenNumberToStartWith ? 2 : 1;
    	
        while (number <= 10) {
            if (number%2==0) {
               print.printEven(number);
            } else {
               print.printOdd(number);
            }
            number += 2;
        }
    }
    public static void main(String... args) {
        Printer print = new Printer();
        Thread t1 = new Thread(new TaskEvenOdd(print,false),"ODD Thread");
        Thread t2 = new Thread(new TaskEvenOdd(print,true),"EVEN Thread");
        t1.start();
        t2.start();
    }
	
}