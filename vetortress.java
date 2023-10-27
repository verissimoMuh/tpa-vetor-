package tpa;
import java.util.Scanner;
public class vetortress {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
	final int TAM=10;
    int a[], b[], i;
    a = new int[TAM];
    b = new int[TAM];
 
 
   ;
 
    for (i = 0; i < TAM; i++) {
        System.out.print("digite o valor da posição " + (i + 1) + " A: ");
        a[i] = in.nextInt();
    }
 
    for (i = 0; i < TAM; i++) {
        b[i] = a[9 - i];
    }
 
    System.out.println("vetor B invertido:");
    for (i = 0; i < TAM; i++) {
        System.out.print(b[i] + " ");
    }
    System.out.println();
 
		}
 
	}
 
 
