package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.print("Informe a quantidade de valores: ");
		int n = sc.nextInt();
		int[] linhas = new int[n];
		for (int i = 0; i < linhas.length; i++) {
			
			System.out.printf("%d° valor: ", i+1);
			linhas[i] = sc.nextInt();
		
			list.add(linhas[i]);
		}
        
		// Ordena em ordem crescente e filtra os números pares
		Collections.sort(list);
		list.stream().filter(x -> x % 2 == 0).map(x -> x).forEach(System.out::println);
		
		// Ordena em ordem crescente e filtra os números impares
		Collections.reverse(list);
		list.stream().filter(x -> x % 2 != 0).map(x -> x).forEach(System.out::println);

		sc.close();


	}

}
