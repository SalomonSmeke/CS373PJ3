package observer;

import java.util.Observable;
import java.util.Scanner;

public class InputHandler extends Observable implements Runnable {

    @SuppressWarnings("resource")
	@Override
	public void run() {    	
    	Scanner sc = new Scanner(System.in);
        while (true) {
            String response = sc.next();
            setChanged();
            notifyObservers(response);
        }
    }
}
