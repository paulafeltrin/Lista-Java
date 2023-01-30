/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;
import java.util.Scanner;

/**
 *
 * @author Paula
 */
public class MetExercicio03 {
    public static void metEx03(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) {
	    mensagem("|----------------CONVERSOR DE TEMPERATURAS----------------|");
            mensagem("| Opção 1 - Conversão de Graus Celsius para Fahrenheit    |");
            mensagem("| Opção 2 - Conversão de Graus Fahrenheit para Celsius    |");
            mensagem("| Opção 3 - Sair                                          |");
            mensagem("|---------------------------------------------------------|");
            mensagem("Digite uma opção: ");
            int opcao = entrada.nextInt();

            if (opcao == 3) {
                System.out.print("Até logo!");
                break;
            }
            float resultado = 0;
	
            switch (opcao) {
                case 1:
                    mensagem("Conversão de Graus Celsius para Fahrenheit Selecionado");
                    mensagem("Digite a temperatura em Graus Celsius: ");
                    float temperaturaCelsius = entrada.nextFloat();
                    resultado = celsiusToFahrenheit(temperaturaCelsius);
                    break;
                case 2:
                    mensagem("Conversão de Graus Fahrenheit para Celsius Selecionado");
                    mensagem("Digite a temperaturaem Graus Fahrenheit: ");
                    float temperaturaFahrenheit = entrada.nextFloat();
                    resultado = fahrenheitToCelsius(temperaturaFahrenheit);
                    break;
                default:
                    mensagem("Opção Inválida!");
                    break;
            }
            mensagem("|---------------------------------------------------------|");
        }
    }
    public static void mensagem(String msg){
        System.out.println(msg);
    }

    public static float celsiusToFahrenheit(float temperaturaCelsius){
        float temperaturaFahrenheit = (9f * temperaturaCelsius) / 5f;
        System.out.println("Celsius para Fahrenheit: " + temperaturaFahrenheit);
        return temperaturaFahrenheit;
    }

    public static float fahrenheitToCelsius(float temperaturaFahrenheit){
        float temperaturaCelsius = (( temperaturaFahrenheit - 32) * 5) / 9;
        System.out.println("Fahrenheit para Celsius : " + temperaturaCelsius);
        return temperaturaCelsius;
    }
}
