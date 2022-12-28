import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		// TODO Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom
		// “DIADEFESTA”. Faça um programa onde o funcionário digite o valor da compra e
		// um
		// cupom, informando o valor final a ser pago
		Scanner leitor = new Scanner(System.in);
		double valorfinal, valorinicial;
		String cupom;

		System.out.println("Por favor, digite o valor da compra:");
		valorinicial = leitor.nextDouble();
		
		System.out.println("Digite o cupom:");
		cupom = leitor.next();
		
		if (cupom.equalsIgnoreCase("DIADEFESTA") ) {
			valorfinal = valorinicial  /  1.03;
			System.out.println("O valor a ser pago com desconto é " + valorfinal);
		}else {
			System.out.println("O valor a ser pago é de " + valorinicial);
		}
		
	}

}
