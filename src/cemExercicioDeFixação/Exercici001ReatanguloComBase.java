package cemExercicioDeFixação;

import java.util.Scanner;

public class Exercici001ReatanguloComBase {
	public static void main(String[] args) {

		double area, perimetro, base, altura;

		// Minha entrada de dados
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Digite a base = ");
		base = entrada.nextDouble();

		System.out.printf("Digite a Altura = ");
		altura = entrada.nextDouble();
		// Com Processamento

		area = base * altura;
		perimetro = ((base * 2) + (altura * 2));

		// Saída de Dados
		System.out.println("A área do Retângulo e = " + area);
		System.out.println("O Perimetro do Retâgulo é = " + perimetro);

		entrada.close();

	}

}
