import java.util.Random;

import javax.swing.JOptionPane;

public class JogoDaAdiviacao {

	public static void main(String[] args) {

		int numSorteado = new Random().nextInt(10) + 1;
		int palpite = Integer.parseInt(JOptionPane.showInputDialog(null, "Palpite"));

		if (numSorteado == palpite) {

			System.out.println("Acertou");
 
		} else {
			System.out.println("Erroooouuu!!!");
			System.out.println("O número Sorteado foi Número 06");
		}

	}

}
