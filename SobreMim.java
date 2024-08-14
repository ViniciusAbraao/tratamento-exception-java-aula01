package tratamento_excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SobreMim {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			
		Scanner s = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite seu nome: ");
		String nome = s.next();
		if (nome == null || nome.trim().isEmpty() || !nome.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Nome vazio ou informado de forma incorreta! Deve conter apenas letras.");
        }
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = s.next();
		if (sobrenome == null || sobrenome.trim().isEmpty() || !sobrenome.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Sobrenome vazio ou informado de forma incorreta! Deve conter apenas letras.");
        }
		
		System.out.println("Digite sua idade: ");
		int idade = s.nextInt();
		
		System.out.println("Digite sua altura: ");
		
		double altura = s.nextDouble();
		
		System.out.println("Olá me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
		System.out.println("Tenho " + idade + " anos");
		System.out.println("Tenho " + altura + " metros");
		
		s.close();
		
		}catch(InputMismatchException e) {
			System.err.println("Os campos altura e idade precisam ser númericos!");
		}catch(IllegalArgumentException e){
			System.err.println(e.getMessage());
		}
	}

}
