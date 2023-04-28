import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.Level;

public class Principal {

	public static void main(String[] args) throws IOException {
		try (Scanner leitura = new Scanner(System.in)) {
			Log meuLogger = new Log("Log.txt");
			meuLogger.logger.setLevel(Level.INFO);
			meuLogger.logger.info("Iniciando a Calculadora!");

			Calculadora c = new Calculadora();
			float a = 0, b = 0, resultado = 0;
			String operador;
			System.out.println("Calculadora");
			do {
				System.out.println("Insira o operador +, -, *, /");
				operador = leitura.nextLine();
			} while (!(operador.contains("+") || operador.contains("-") || operador.contains("*")
					|| operador.contains("/")));

			System.out.println("Insira o 1o valor");
			a = leitura.nextFloat();
			System.out.println("Insira o 2o valor");
			b = leitura.nextFloat();

			resultado = c.calcular(a, b, operador.charAt(0));

			System.out.printf("O resultado de " + a + " " + operador + " " + b + ": %.2f", resultado);
			System.out.println("\n");

			
			meuLogger.logger.setLevel(Level.INFO);
			meuLogger.logger.info("Seu calculo foi finalizado! \n" + "Seu resultado foi de: " + resultado);

		}catch (Exception e){

		}

	}

}
