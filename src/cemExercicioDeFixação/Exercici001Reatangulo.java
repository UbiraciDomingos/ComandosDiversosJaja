package cemExercicioDeFixação;

import java.util.Scanner;

public class Exercici001Reatangulo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double base, altura, area;
		System.out.printf("entre com valor da base = ");

		base = entrada.nextDouble();
		System.out.printf("Entre com o valor da altura = ");

		altura = entrada.nextDouble();
		System.out.printf("Entre com o valor da Area = ");

		area = entrada.nextDouble();

		// retangulo = sc.nextDouble();
		// System.out.println();
		System.out.println("O valor da Perimetro é = " + (base * altura / area));
		// System.out.println("entre com o valor da autura ");

		// System.out.println("O valo do Perimetro é = " + area * altura / area);

		entrada.close();
	}

}
