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
public class MetExercicio05 {
    public static void metEx05(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            mensagem("|-----------------COMPRAS-----------------|");
            mensagem("| Opção 1 - Realizar Venda                |");
            mensagem("| Opção 2 - Calcular Pagamento a Vista    |");
            mensagem("| Opção 3 - Calcular Pagamento Parcelado  |");
            mensagem("| Opção 4 - Calcular Prestação em Atraso  |");
            mensagem("| Opção 5 - Sair                          |");
            mensagem("|-----------------------------------------|");
            mensagem("Digite uma opção: ");
            int opcao = entrada.nextInt();	
            if (opcao == 5) {
                System.out.print("Até logo!");
                break;
            }
            float n1 = 0, n2 = 0, n3 = 0;
	
            switch (opcao) {
                case 1:
                    mensagem("Realizar Venda Selecionado");
                    realizarVenda(n1);
                    break;
                case 2:
                    mensagem("Calcular Pagamento a Vista Selecionado");
                    pmtVista(n1, n2);
                    break;
                 case 3:
                    mensagem("Calcular Pagamento Parcelado Selecionado");
                    pmtParcelado(n1, n2);
                    break;
                 case 4:
                    mensagem("Calcular Prestação em Atraso Selecionado");
                    pmtAtraso(n1, n2, n3);
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

    public static float realizarVenda(float valorProduto){
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o valor do produto: ");
    valorProduto = entrada.nextFloat();
    float valorTotal = valorProduto * (1f + (0.25f + 0.65f));

    System.out.println("Valor total do produto: " + valorTotal + " reais");
    return valorTotal;
    }

    public static float pmtVista(float valorProduto, float valorPorcentagem){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        valorProduto = entrada.nextFloat();

        System.out.print("Digite o valor do desconto: ");
        valorPorcentagem = entrada.nextFloat();
        float valorDecimal = valorPorcentagem / 100;

        float valorTotal = 0;

        if (valorDecimal > 0.16){
            System.out.println("Valor porcentual excedeu valor máximo");
        } else {
            valorTotal = valorProduto * (1 - valorDecimal);
            System.out.println("Valor total do produto: " + valorTotal + " reais");
            System.out.println("Porcentagem: " + valorPorcentagem + "%");
        }
        return valorTotal;
    }

    public static float pmtParcelado(float valorProduto, float quantidadePmt){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        valorProduto = entrada.nextFloat();

        System.out.print("Digite a quantidade de parcelas: ");
        quantidadePmt = entrada.nextFloat();
	    
        float juros = 0.02f;
        float valorTotal = 0;
      
        if((quantidadePmt >= 3) && (quantidadePmt <= 36)){
            for (int i = 1; i <= quantidadePmt; i++){
                valorTotal = valorTotal + (valorTotal + juros);
                //System.out.println("Valor: "+ i + "  " + valorTotal);
            }
            valorTotal = valorProduto + valorTotal;
            System.out.println("Valor total: " + valorTotal + " reais");
            System.out.println("Quanidade de parcelas: " + quantidadePmt);
        } else {
            System.out.println("Quantidade de parcelas não permitida");
        }
	
        return valorTotal;
    }

    public static float pmtAtraso(float valorAtrasado, float quantidadeDias, float taxaAtraso){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor em atraso: ");
        valorAtrasado = entrada.nextFloat();

        System.out.print("Digite a quantidade de dias em atraso: ");
        quantidadeDias = entrada.nextFloat();

        System.out.print("Digite a taxa executada para atraso: ");
        taxaAtraso = entrada.nextFloat();

        float pagamentoAtrasado = valorAtrasado + (valorAtrasado * (taxaAtraso / 100) * quantidadeDias);
        System.out.println("Valor da prestação atrasado atualizado: " + pagamentoAtrasado + " reais");

        return pagamentoAtrasado;
    }

}
