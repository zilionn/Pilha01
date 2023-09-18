package view;

import model.PilhaInt;

public class Principal {

	public static void main(String[] args) throws Exception {
		PilhaInt p = new PilhaInt();
		int valor1; int valor2; int cont = 0;
		
		int[] vet = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		
		for(int i = 0; i < vet.length ; i++) {
			if(vet[i] >= 0) {
				p.push(vet[i]);
			} else {
				valor1 = p.pop();
				valor2 = p.pop();
				int result = valor1 + valor2;
				p.push(vet[i]);
				p.push(result);
			}
		}
		while(!p.isEmpty()) {
			p.pop();
			cont++;
		}
		
		System.out.println(cont);

	}

}
