import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n=1;
		while (n==1){
			Retangulo ret = new Retangulo();
			System.out.println("Digite a base do retangulo");
			ret.base = scan.nextInt();
			System.out.println("Digite a altura do retangulo");
			ret.altura = scan.nextInt();
			ret.calc();
			System.out.println("Novamente digite 1 \nSair digite 0");
			n = scan.nextInt();
		}
	}
}
