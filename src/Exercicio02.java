import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		// Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos,
		// solicite ao usuário que digite o tempo de um filme em minutos e informe a
		// duração
		// desse filme em horas e em segundos

		double duracao, horas, segundos;
		Scanner leitor = new Scanner(System.in);

		System.out.println("Por favor digite o tempo de duração do filme em minutos:");
		duracao = leitor.nextInt();

		horas = duracao / 60;
		segundos = duracao * 60;
		
		
		System.out.println("A duração do filme em horas é de " + horas + " horas e sendo " + segundos + " segundos " );
	}

}
