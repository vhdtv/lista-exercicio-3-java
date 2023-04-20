package ListaExercicios3;
import java.util.Scanner;	
public class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double Salario;
		char EstadoCivil, Sexo;
		int Idade;
		String Nome;
		do {
		System.out.println("Digite o seu nome acima de 3 caracteris:");
		Nome = scan.nextLine();
		if(Nome.length() <= 3)
			System.out.println("Nome invalido.");
		}while(Nome.length() <= 3);
		do {
		System.out.println("Digite a sua idade entre 0 e 150 anos:");
		Idade = scan.nextInt();
		if(Idade<0 || Idade>150)
			System.out.println("Idade invalida.");
		}while(Idade<0 || Idade>150);
		do {
		System.out.println("Digite o seu salario que seja maior do 0:");
		Salario = scan.nextDouble();
		if(Salario<0)
			System.out.println("Salario invalido.");
		}while(Salario<0);
		do {
		System.out.printf("Digite o seu sexo:\nf -- feminino\nm -- masculino\n");
		Sexo = scan.next().charAt(0);
		if(Sexo != 'f' && Sexo != 'm')
			System.out.println("Sexo invalido.");
		}while(Sexo != 'f' && Sexo != 'm');
		do {
		System.out.println("Digite o seu estado civil:\ns -- solteiro\nc -- casado\n"
				+ "v -- viuvo\nd -- divorciado");
		EstadoCivil = scan.next().charAt(0);
		if(EstadoCivil != 's' && EstadoCivil != 'c'&& EstadoCivil != 'v' 
				&& EstadoCivil != 'd') 
			System.out.println("Estado civil invalido.");
		}while(EstadoCivil != 's' && EstadoCivil != 'c'&& EstadoCivil != 'v' 
				&& EstadoCivil != 'd');
		scan.close();
	}
}
