package hello;

import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		System.out.println("Digite uma frase qualquer:");
		frase = teclado.nextLine();
		System.out.println(frase);
	}

}
