import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Para um ano de nascimento fornecido pelo usuário, informe a idade que ele terá no 
				//dia 31 de dezembro de 2022.
				Scanner leitor = new Scanner(System.in);

				int idade, datanasc;
			System.out.println("Por favor, informe os quatro digitos do ano de seu nascimento:");
			datanasc = leitor.nextInt();
			
			if (datanasc < 2022) {
				idade = 2022 - datanasc;
				System.out.println("No dia 31 de Dezembro de 2022 a sua idade será de: "+ idade + " anos");
			}else {
				System.out.println("Ano de nascimento invalido, por favor verifique e digite novamente");
			}
			
			
			
			
			
			}

		}
