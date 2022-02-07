package contadordoordenado;


public class Contadorordenado {
	
	public static void main(String[] args) {
		
		int[] lista = {12,56,27,03,78}; 
		
		int aux;
		
		System.out.println("### CONTADOR EM ORDEM CRESCENTE ###");
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {
				if(lista[j] > lista[j+1]) {
					aux = lista[j];
					lista[j] = lista[j+1];
					lista[j+1] = aux;
			}
		  }
		}
		int k = 0;
		while (k < lista.length) {
			System.out.print(lista[k] + ", ");
			k++;
		}
	}
}