package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();

		int n = sc.nextInt();
		int[] linhas = new int[n];
		for (int i = 0; i < linhas.length; i++) {
			linhas[i] = sc.nextInt();
		
			list.add(linhas[i]);
		}

		Collections.sort(list);
		list.stream().filter(x -> x % 2 == 0).map(x -> x).forEach(System.out::println);
		Collections.reverse(list);
		list.stream().filter(x -> x % 2 != 0).map(x -> x).forEach(System.out::println);

		sc.close();


	}

}
