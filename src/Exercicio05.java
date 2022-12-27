import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//  Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso. 
		//Entre os pesos de 3 lixos informados pelo usuário, um programa deve indicar qual deles 
		//deve ser carregado pelo drone

		Scanner leitor = new Scanner(System.in);
		int peso1, peso2, peso3;
		
		System.out.println("Por favor informe o peso de cada um dos lixos:");
		
		System.out.println("Lixo 1:");
		peso1 = leitor.nextInt();
		
		System.out.println("Lixo 2:");
		peso2 = leitor.nextInt();
		
		System.out.println("Lixo 3:");
		peso3 = leitor.nextInt();
		
		
		
		
		if (peso1 > peso2  ) {
			System.out.println("O lixo 2 deve ser o primerio a ser carregado");
		}else if (peso2 > peso1){
			
			System.out.println("O lixo 1 deve ser o primeiro a ser carregado");
		
		}else if (peso3 > peso1) {
			System.out.println("O lixo 3 deve ser o primeiro a ser carregado");

		}
	}

}
