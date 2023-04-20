package ListaExercicios3;
import java.util.Scanner;
public class Ex7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int SomaNumerosPar=0, SomaNumerosImpar=0;
		for(int i = 0; i<10; i++) {
			System.out.println("Digite 10 numeros inteiros aleatorios para saber quantos sao par"
					+ " e quantos sao impar");
			int Numeros = scan.nextInt();
			if(Numeros%2 ==1)
				SomaNumerosPar++;
			else
				SomaNumerosImpar++;
		}
		System.out.printf("Temos %d numeros pares.\nTemos %d numeros impares.",SomaNumerosImpar, SomaNumerosPar);
		scan.close();
	}
}
