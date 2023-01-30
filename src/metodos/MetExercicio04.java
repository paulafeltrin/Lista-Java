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
public class MetExercicio04 {
    public static void metEx04(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            mensagem("|---------------LEI DE OHM----------------|");
            mensagem("| Opção 1 - Calcular Tensão Elétrica      |");
            mensagem("| Opção 2 - Calcular Resistência Elétrica |");
            mensagem("| Opção 3 - Calcular Corrente Elétrica    |");
            mensagem("| Opção 4 - Calcular Potência Elétrica    |");
            mensagem("| Opção 5 - Sair                          |");
            mensagem("|-----------------------------------------|");
            mensagem("Digite uma opção: ");
            int opcao = entrada.nextInt();
            if (opcao == 5) {
                System.out.print("Até logo!");
                break;
            }
            float n1 = 0, n2 = 0;
			
            switch (opcao) {
                case 1:
                    mensagem("Calcular Tensão Elétrica Selecionado");
                    tensao(n1, n2);
                    break;
                case 2:
                    mensagem("Calcular Resistência Elétrica Selecionado");
                    resistencia(n1, n2);
                    break;
                 case 3:
                    mensagem("Calcular Corrente Elétrica Selecionado");
                    corrente(n1, n2);
                    break;
                 case 4:
                    mensagem("Calcular Potência Elétrica Selecionado");
                    potencia(n1, n2);
                    break;
                default:
                    mensagem("Opção Inválida!");
                    break;
            }
            mensagem("|-----------------------------------------|");
	}
    }
    public static void mensagem(String msg){
        System.out.println(msg);
    }

    public static float tensao(float resistenciaOhms, float correnteAmpere){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a resistência em Ohms: ");
        resistenciaOhms = entrada.nextFloat();

        System.out.print("Digite a corrente em Ampéres: ");
        correnteAmpere = entrada.nextFloat();

        float tensaoVolts = resistenciaOhms * correnteAmpere;
        System.out.println("A tensão é: " + tensaoVolts + " Volts");

        return tensaoVolts;
    }

    public static float resistencia(float tensaoVolts, float correnteAmpere){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a tensão em Volts: ");
        tensaoVolts = entrada.nextFloat();

        System.out.print("Digite a corrente em Ampéres: ");
        correnteAmpere = entrada.nextFloat();

        float resistencia = tensaoVolts / correnteAmpere;
        System.out.println("A resistência é: " + resistencia + " Ohms");

        return resistencia;
    }

    public static float corrente(float tensaoVolts, float resistenciaOhms){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a tensão em Volts: ");
        tensaoVolts = entrada.nextFloat();

        System.out.print("Digite a resistência em Ohms: ");
        resistenciaOhms = entrada.nextFloat();

        float correnteAmpere = tensaoVolts / resistenciaOhms;
        System.out.println("A corrente é: " + correnteAmpere + " Ampéres");

        return correnteAmpere;
    }

    public static float potencia(float tensaoVolts, float correnteAmpere){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a tensão em Volts: ");
        tensaoVolts = entrada.nextFloat();

        System.out.print("Digite a corrente em Ampéres: ");
        correnteAmpere = entrada.nextFloat();

        float potenciaWatts = tensaoVolts * correnteAmpere;
        System.out.println("A potência é: " + potenciaWatts + " Watts");

        return potenciaWatts;
    }
}
