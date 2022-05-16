package Ordenacao;

public class Verificacao_de_tempo_ordenacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				int rnd = (int) (1 + Math.random() * 1000);
				arr[i] = rnd;

				if (arr[i] == arr[j] && i != j) {
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		selectionSort(arr);
	}

	public static void selectionSort(int[] arr) {
		long startTime = System.nanoTime();

		for (int i = 0; i < arr.length - 1; i++) {
			int indice = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[indice]) {
					indice = j; // procurando o menor indice
				}
			}
			int menorNumero = arr[indice];
			arr[indice] = arr[i];
			arr[i] = menorNumero;
		}
		System.out.println(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Valor: " + arr[i]);
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("Verificar tempo para ordenação: " + duration + " ms");
	}

}


