
import java.util.Scanner;
public class vetor4 {

 

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[], i;
		double media=0;
		a = new int [TAM];
		

 

		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
			media= a[i] + media;
		}

		for (i=0; i<1; i++) {
			media = media/10;
			System.out.printf("A media � %.0f",media);
		}
	}

}

