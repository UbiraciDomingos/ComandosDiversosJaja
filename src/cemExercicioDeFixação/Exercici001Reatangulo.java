package cemExercicioDeFixação;

import java.util.Scanner;

public class Exercici001Reatangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double base, altura, area, retangulo;
		System.out.printf("entre com valor da base = ");

		base = sc.nextDouble();
		System.out.printf("Entre com o valor da altura = ");

		altura = sc.nextDouble();
		System.out.printf("Entre com o valor da Area = ");

		area = sc.nextDouble();

		retangulo = sc.nextDouble();
		System.out.println();
		System.out.println("O valor da area é = " + base * altura);
		System.out.println("entre com o valor da autura ");

		// System.out.println("O valo do Perimetro é = " + area + altura + area +
		// retangulo);
	}
}
