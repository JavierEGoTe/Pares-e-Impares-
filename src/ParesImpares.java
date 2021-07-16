import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int sumapar = 0;
		int sumaimpar = 0;
		System.out.println("Escribe el numero que deseas: ");
		Scanner in = new Scanner(System.in);
		numero= Integer.parseInt(in.nextLine());
		for(int i = 1; i <= numero; i++) {

			if (i % 2 == 0) {
				sumapar = sumapar + i;
			} else {
				sumaimpar = sumaimpar + i;
			}
			
		}
		System.out.println("La suma de numeros pares hasta el numero "+ numero + " es: "+ sumapar);
		System.out.println("La suma de numeros impares hasta el numero "+ numero + " es: "+ sumaimpar);
	}

}
