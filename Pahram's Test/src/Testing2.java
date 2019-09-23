/*instructions: ASk the user which car manufacturer they like best between lambos and ferraris. Then, provide the user with a sample  
 * list of models to choose from. Ask them whether they like  to customize the cars or not. Based on the company they choose, tell them what kind of a 
 * person they are*/

import java.util.Scanner;
public class Testing2 {

	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Which manufacturer do you prefer between Lamborghini and Ferrari? ");
		String car = scan.nextLine();

		if (car.equals("ferrari")) {
			System.out.println("Choose your model from the following list: 458, 488, enzo, f40: ");
		} 

		if (car.equals("lambo")) { 
			System.out.println("Choose your model from the following list: Venon, Aventador, Urus, Reventon"); 
		} else {
			System.out.print("You did not follow instructions! Go back and re-read!");
		}

		String fModels = "458 , 488 , enzo , f40";
		String lModels = "Venon, Aventador, Urus, Reventon";

		System.out.print("I choose the model: ");
		String models = scan.nextLine();
		if (models.equals(fModels)) {
			System.out.print("ok");
		}
		
		if (models.equals(lModels)) {
			System.out.print("ko");
		} else {
			System.out.print("efgbrg");
		}

		scan.close();

	}
}
