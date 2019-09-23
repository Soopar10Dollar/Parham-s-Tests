import java.util.Scanner;
public class Testing {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("How much money do you have? $");
			double money = scan.nextDouble();
			
			double moneyy = 50.0;
		
			if (money <= moneyy) {
			
				System.out.print("Make money, NOW!");
			}
			 
			if (money > moneyy) {
				System.out.print("It doesn't matter, you STILL have to make more money!");
			}
			
			scan.close();
	}

}
