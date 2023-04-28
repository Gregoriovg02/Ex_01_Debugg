
public class Calculadora {
	public float calcular(float a, float b, char operacao) {
		float resultado = 0;
		float maior = a;
		float menor = b;

		switch (operacao) {
			case '+': {
				if (maior < menor) {
					resultado = menor + maior;
				} else {
					resultado = a + b;
				}

				break;
			}
			case '-': {
				if (maior < menor) {
					resultado = b - a;
				} else {
					resultado = a - b;
				}

				break;
			}
			case '/': {
				if (maior < menor) {
					resultado = b / a;
				} else {
					resultado = a / b;
				}

				break;
			}
			case '*': {
				resultado = a * b;
				break;
			}

		}
		return resultado;

	}
}
