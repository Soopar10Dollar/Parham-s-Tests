import java.util.Scanner;
public class Testing {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("How much money do you have? $");
			double money = scan.nextDouble();
			
			double moneyy = 50.0;
		
			if (money <= moneyy) {
			
				System.out.print("Make money, bitch!");
			}
			 
			if (money > moneyy) {
				System.out.print("You still have to make more money!");
			}
			
			scan.close();
	}

}
