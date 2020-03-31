import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =5;
		
		while(num !=6) {
			System.out.println("**Cup-Ramen Manager**");
			System.out.println("Select one number between 1-5");
			System.out.println("1. Add New Cup-Ramen");
			System.out.println("2. Delete Cup-Ramen");
			System.out.println("3. Edit Cup-Ramen");
			System.out.println("4. View Cup-Ramen");
			System.out.println("5. Show a Main menu");
			System.out.println("6. Exit");
			num=input.nextInt();
			if (num ==1) {
				addCupRamen();
			}
			else if (num ==2) {
				deleteCupRamen();
			}
			else if (num ==3) {
				editCupRamen();
			}
			else if (num ==4) {
				viewCupRamen();
			}
			else {
				continue;
			}
			}
		}
	public static void addCupRamen() {
		Scanner input = new Scanner(System.in);
		System.out.print("Ramen Number:");
		int ramenNumber = input.nextInt();
		System.out.print("Ramen Name:");
		String ramenName=input.next();
		System.out.print("Ramen price:");
		String ramenPrice=input.next();
		System.out.print("Ramen Company:");
		String ramenCompany=input.next();
		System.out.print("Extra information:");
		String ramenInfo=input.next();
		System.out.println(ramenNumber+","+ramenName+","+ramenPrice+","+ramenCompany+","+ramenInfo);
	}
	public static void deleteCupRamen() {
		Scanner input = new Scanner(System.in);
		System.out.print("Ramen Number:");
		int ramenNumber = input.nextInt();
	}	
	public static void editCupRamen() {
		Scanner input = new Scanner(System.in);
		System.out.print("Ramen Number:");
		int ramenNumber = input.nextInt();
}	
	public static void viewCupRamen() {
		Scanner input = new Scanner(System.in);
		System.out.print("Ramen Number:");
		int ramenNumber = input.nextInt();
	}
}


