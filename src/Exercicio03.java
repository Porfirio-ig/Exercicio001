import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//  Solicite ao usuário a digitação de 2 números inteiros, nas variáveis A e B. Sem usar 
		//uma terceira variável, troque os valores de A e B entre si.

Scanner leitor = new Scanner(System.in);
int A, B;

System.out.println("Por favor, digite dois valores inteiros: ");


System.out.println("Por favor, digite o primeiro valor");
A = leitor.nextInt();

System.out.println("Por favor, digite o segungo valor");
B = leitor.nextInt();

A = B;
B = A - B;
B = B + A;


System.out.println("Os valores invertidos correspondem a: " + A + " e " + B );
	}

}
