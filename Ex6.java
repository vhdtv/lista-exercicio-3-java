package ListaExercicios3;
import java.util.Scanner;
public class Ex6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Digite os dois numeros inteiros que deseja saber o intervalo entre eles:");
		numero1 = scan.nextInt();
		numero2= scan.nextInt();
		for(int i=0; i<numero1 || i<numero2; i++) {
			if(i>numero1 && i<numero2 || i<numero1 && i>numero2) {
				System.out.println(""+i);
			}
		}
		scan.close();
	}
}
