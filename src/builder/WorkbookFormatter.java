package builder;

import java.util.Scanner;

/*
 * Basically the same example as in class. We have an entry of data that must be printed.
 * 
 * We offload the task to a builder (Converter) that will do the conversions for us. We just pick the format.
 * Useful because it decouples the logic of the formater from the converter, and is flexible in the adding
 * of new formats (just add a class that handles it).
 */

public class WorkbookFormatter {
	static Scanner sc = new Scanner (System.in);
	public static void main(String []args){

		char EOL = '\n';

		String [][] worksheet = new String[
		                                   promptInt("Enter the amount of rows in your Worksheet" + EOL,"INVALID INPUT: Not a number" + EOL)][
		                                                                                                                                      promptInt("Enter the amount of columns in your Worksheet" + EOL,"INVALID INPUT: Not a number" + EOL)];
		getValues(worksheet);
		convert(worksheet);
	}

	public static void convert(String [][] request){
		char EOL = '\n';
		String [] choices = Converter.getAvailable();
		String conversion = promptInVals(choices,"What format do you want to convert to?"+EOL,"Thats not a valid choice"+EOL);
		print(Converter.convertInto(conversion, request));
	}

	public static void getValues(String [][] request){
		String prompt = "Enter Value For: ";

		for (int x = 0; x < request.length; x++){
			for (int y = 0; y < request[x].length; y++){
				request[x][y] = promptString(prompt + x + "," + y + ": ");
			}
		}
	}

	public void printLn(String print){
		System.out.println(print);
	}

	public static void print(String print){
		System.out.print(print);
	}

	public static String promptInVals(String[] vals, String prompt, String fallback){

		print(prompt);
		print("Available choices: ");
		for (int i = 0; i < vals.length; i++){
			print(vals[i] + " ");
		}
		String in = sc.nextLine();
		while (!contains(vals,in)){
			print(fallback);
			in = sc.nextLine();
		}
		return in;
	}

	private static boolean contains(String[] vals, String in) {
		for (int i = 0; i < vals.length; i++){
			if (in.equals(vals[i])) return true;
		}
		return false;
	}

	public static String promptString(String prompt){
		print(prompt);
		String in = sc.nextLine();
		return in;
	}

	public static int promptInt(String prompt, String fallback){
		print(prompt);
		String in = sc.nextLine();
		while (!isInt(in)){
			print(fallback);
			in = sc.nextLine();
		}
		return Integer.parseInt(in);
	}

	public static boolean isInt(String check){
		try {  
			Integer.parseInt(check);  
			return true;
		} catch (NumberFormatException e) {  
			return false;  
		}  
	}
}
