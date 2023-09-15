package controller;
import model.PilhaInt;
public class CalcController {

	public CalcController() {
		super();
	}
	PilhaInt P = new PilhaInt();
	
	public void Positivo(int Valor) {
		P.Push(Valor);
	}
	public void negativo(int Valor) {
		try {
			int A = P.pop();
			int B = P.pop();
			int resultado = A + B;
			P.Push(Valor);
			P.Push(resultado);
		} catch (Exception e) {
		}
	}
	public int Tamanho (int tam) {
		tam = P.size();
		return tam;
	}
}