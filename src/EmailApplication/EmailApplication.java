package EmailApplication;

import java.util.Scanner;

public class EmailApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter first name: ");
		String firstName = sc.nextLine();
		Scanner sd = new Scanner(System.in); 
		System.out.println("Enter Last name: ");
		String lastName = sd.nextLine();
		System.out.println("Enter Last name: ");
		Email em1 = new Email(firstName, lastName);
		
		System.out.println(em1.showInfo());
	}

}
