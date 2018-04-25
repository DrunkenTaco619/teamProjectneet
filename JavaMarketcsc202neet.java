package teamprojectnse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaMarketcsc202neet {

	public static void main(String[] args) {
		
		startUp();
		
	}
	public static void startUp(){
		System.out.println("Welcome to the java market. We hope you like your visit.");
		int choice;
		while ((choice=menu())!=3){
			switch (choice){
			case 1: {
				startUp();
				break;
			}
			case 2: {
				startSim();
				break;
			}
			}
		}
		System.out.println("Thank you for your participation in our program.");
	}
	public static int menu(){
		Scanner keyboard = new Scanner(System.in);
		boolean valid = false;
		int answer = 0;
		while (!valid||answer<1||answer>3){
			valid = true;
			System.out.println("1) Start realistic simulation.");
			System.out.println("2) Start test simulation.");
			System.out.println("3) exit");
			try {
				answer = keyboard.nextInt();
				keyboard.nextLine();
			} catch (InputMismatchException e){
				keyboard.nextLine();
				valid = false;
			}
			if (answer<1||answer>3||!valid){
				valid = false;
				answer = 0;
				System.out.println("Please input a correct choice!");
			}
		}
		return answer;
	}
	public static void startMenu(){
		Scanner keyboard = new Scanner(System.in);
		int arrive=0;
		int leave = 0;
		int start=0;
		int end=0;
		boolean valid = false;
		while (!valid){
			valid = true;
			System.out.println("Enter a minimum interarrival time.(Minimum of 1)");
			try {
				arrive = keyboard.nextInt();
				keyboard.nextLine();
			} catch (InputMismatchException e){
				keyboard.nextLine();
				valid = false;
			}
			if (!valid||arrive<1){
				arrive = 0;
				valid = false;
				System.out.println("Please enter a valid arrival time.");
			}
		}
		valid = false;
		while (!valid){
			valid = true;
			System.out.println("Enter a maximum interarrival time.");
			try {
				leave = keyboard.nextInt();
				keyboard.nextLine();
			} catch (InputMismatchException e){
				keyboard.nextLine();
				valid = false;
			}
			if (!valid||leave<arrive){
				leave = 0;
				valid = false;
				System.out.println("Please enter a valid arrival time.(must be greater than your minimum interval!)");
			}
		}
		valid = false;
		while (!valid){
			valid = true;
			System.out.println("Enter a minimum service time.(Minimum of 1)");
			try {
				start = keyboard.nextInt();
				keyboard.nextLine();
			} catch (InputMismatchException e){
				keyboard.nextLine();
				valid = false;
			}
			if (!valid||start<1){
				start = 0;
				valid = false;
				System.out.println("Please enter a valid service time.(Minimum of 1)");
			}
		}
		valid = false;
		while (!valid){
			valid = true;
			System.out.println("Enter a maximum service time.");
			try {
				end = keyboard.nextInt();
				keyboard.nextLine();
			} catch (InputMismatchException e){
				keyboard.nextLine();
				valid = false;
			}
			if (!valid||end<start){
				end = 0;
				valid = false;
				System.out.println("Please enter a valid service time.(Must be greater than the minimum!)");
			}
		}
		valid = false;
		CustomerCreator cust = new CustomerCreator(arrive,leave,start,end);
	}
	public static void startSim(){
		Scanner keyboard = new Scanner(System.in);
		int arrive=0;
		int leave = 0;
		int start=0;
		int end=0;
		boolean valid = false;
		while (!valid){
			valid = true;
			System.out.println("Enter a minimum interarrival time.(Minimum of 1)");
			try {
				arrive = keyboard.nextInt();
				keyboard.nextLine();
			} catch (InputMismatchException e){
				keyboard.nextLine();
				valid = false;
			}
			if (!valid||arrive<1){
				arrive = 0;
				valid = false;
				System.out.println("Please enter a valid arrival time.");
			}
		}
		valid = false;
		while (!valid){
			valid = true;
			System.out.println("Enter a maximum interarrival time.");
			try {
				leave = keyboard.nextInt();
				keyboard.nextLine();
			} catch (InputMismatchException e){
				keyboard.nextLine();
				valid = false;
			}
			if (!valid||leave<arrive){
				leave = 0;
				valid = false;
				System.out.println("Please enter a valid arrival time.(must be greater than your minimum interval!)");
			}
		}
		valid = false;
		while (!valid){
			valid = true;
			System.out.println("Enter a minimum service time.(Minimum of 1)");
			try {
				start = keyboard.nextInt();
				keyboard.nextLine();
			} catch (InputMismatchException e){
				keyboard.nextLine();
				valid = false;
			}
			if (!valid||start<1){
				start = 0;
				valid = false;
				System.out.println("Please enter a valid service time.(Minimum of 1)");
			}
		}
		valid = false;
		while (!valid){
			valid = true;
			System.out.println("Enter a maximum service time.");
			try {
				end = keyboard.nextInt();
				keyboard.nextLine();
			} catch (InputMismatchException e){
				keyboard.nextLine();
				valid = false;
			}
			if (!valid||end<start){
				end = 0;
				valid = false;
				System.out.println("Please enter a valid service time.(Must be greater than the minimum!)");
			}
		}
		valid = false;
		//TODO add number of customers
	}
	
}
