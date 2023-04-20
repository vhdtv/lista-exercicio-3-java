package ListaExercicios3;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		float numeros, somanumeros=0, media;
		Scanner scan = new Scanner(System.in);
		for(int i =0; i<5; i++) {
			System.out.println("Digite 5 numeros que deseja obter a media e a soma.");
			numeros = scan.nextFloat();
			somanumeros+=numeros;
		}
		media = somanumeros/5;
		System.out.printf("O valor da soma dos numeros e: %.2f\n"
				+ "A media dos numeros e: %.2f", somanumeros, media);
		scan.close();
	}
}