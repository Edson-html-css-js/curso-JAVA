/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos",
 indicando se os valores lidos são múltiplos entre si.*/ 


 import java.io.IOException;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		int A, B;

		A = input.nextInt();
		B = input.nextInt();

		if ((A % B == 0) | (B % A == 0)) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
    }
}