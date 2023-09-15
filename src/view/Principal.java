package view;
import controller.CalcController;

public class Principal {

	public static void main(String[] args) {
		CalcController C = new CalcController();
		int[] Vet = {0,5,7,-4,3,5,-2,-1,10,4,3,-6,2,-9,1,-5};
		int tamanho = Vet.length;
		for (int i = 0; i < tamanho; i++) {
			if(Vet[i] >= 0) {
				int Valor = Vet[i];
				C.Positivo(Valor);
			}
			else {
				int Valor = Vet[i];
				C.negativo(Valor);
			}
		}
		int tam = C.Tamanho(tamanho);
		System.out.println(tam);
	}

}