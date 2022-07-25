package cemExercicioDeFixação;

import java.util.Scanner;

public class Exercici001Reatangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double base, altura, area;
		System.out.printf("entre com valor da base = ");

		base = sc.nextDouble();
		System.out.printf("Entre com o valor da altura = ");

		altura = sc.nextDouble();
		System.out.printf("Entre com o valor da Area = ");

		area = sc.nextDouble();

		// perimetro = sc.nextDouble();

	 System.out.println("O valo do Perimetro é = " + base * altura * area);
	

		sc.close();
	}
}
