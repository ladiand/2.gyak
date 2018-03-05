import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class kalkulator {
	
	public static void main(String[] args) {
		Scanner bemenet = new Scanner(System.in);
		
		
		System.out.println("Kerem az elso operandus erteket!");
		double elso_operandus = bemenet.nextDouble();
		
		System.out.println("Kerem a masodik operandus erteket!");
		double masodik_operandus = bemenet.nextDouble();

		
		System.out.println("Az elso operandus erteke:");
		System.out.println(elso_operandus);
		System.out.println("A masodik operandus erteke:");
		System.out.println(masodik_operandus);
		
		System.out.println("Kerem az operatort");
		
		
		String operator = bemenet.nextLine();
		System.out.println("Az operator:");
		
		String[] tomb = operator.split(" ");
		elso_operandus = Double.parseDouble(tomb[0]);
		masodik_operandus = Double.parseDouble(tomb[2]);
		operator = tomb[1];
		
		System.out.println(tomb[0]);
		System.out.println(tomb[1]);
		System.out.println(tomb[2]);

		bemenet.close();
	}
}
