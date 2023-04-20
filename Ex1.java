package ListaExercicios3;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nota;
		do {
			System.out.println("Insira notas entre 0 e 10:");
			nota = scan.nextInt();
			if(nota<0 || nota>10)
				System.out.println("O valor e invalido digite um numero entre 0 e 10.");
		}while(nota<0 || nota>10);
		System.out.println("---Nota cadastrada---");
		scan.close();
	}
}
