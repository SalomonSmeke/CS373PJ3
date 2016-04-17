package observer;

import java.util.Observable;
import java.util.concurrent.TimeUnit;

public class example {

	/*
	 * Use-Case:
	 * 
	 * A program has a main thread that excecutes tasks.
	 * This program, would like a non-thread-blocking way of checking some special input
	 * that would change what the code is outputting.
	 * 
	 * Input handler does just that.
	 * 
	 * In this case. If this were a bartering program. We could repeatedly output a prompt.
	 * Since we are very stubborn. We want to buy a watch at a set price. And wont go lower.
	 * But we wont wait for our vendor to give us a reply. We will nag him every few seconds.
	 * Until he accepts!
	 * 
	 * Another example could be a button. Our observer, in that case, would monitor the
	 * state of said button. And trigger some code when its pressed. In this way,
	 * much of GUI's and the internet's codebases are tons of observers!
	 * 
	 */
	public static String message = "Ill buy it for 10$! What will you sell for?";
	public static boolean answered = false;
	
    public static void main(String[] args) throws InterruptedException {
    	System.out.println("Wow! Nice watch.");
    	System.out.println(message);
    	
        InputHandler input = new InputHandler();
        
        //Adding an observer such that the following code is excecuted when satisfied
        input.addObserver( (Observable obj, Object arg) -> {
            if (arg.equals("10")) {
            	message = "SOLD";
            	answered = true;
            } else {
            	System.out.println("nah. how about 10$?");
            }
        });
        new Thread(input).start();
        while(!answered){
        	TimeUnit.SECONDS.sleep(2);
        	System.out.println(message);
        }
        return;
    }
}
