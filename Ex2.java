package ListaExercicios3;
import java.util.Scanner;		
public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String login, senha;
		do {
			System.out.println("Insira seu login:");
			login = scan.nextLine();
			System.out.println("Insira sua senha numerica:");
			senha = scan.nextLine();			
			if(senha.equals(login))
				System.out.println("O login e a senha sao iguais cadastro invalido digite novamente.");
		}while(senha.equals(login));
		System.out.println("---Conta cadastrada---");
		scan.close();
	}
}
