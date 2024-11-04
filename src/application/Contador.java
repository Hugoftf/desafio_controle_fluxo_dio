package application;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
		
		System.out.print("Digite o parametro um: ");
		int parametroUm = sc.nextInt();
		System.out.print("Digite o parametro dois: ");
		int parametroDois = sc.nextInt();
		
		contar(parametroUm, parametroDois);
		
		}
		catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
		
	}
	
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("Parametro invalido, parametro dois maior que parametro um");
		}
		else {
			int contador = parametroDois - parametroUm;
			
			for (int i = 1; i<=contador; i++) {
				System.out.println("contando: " + i);
			}
		}
	}

}
