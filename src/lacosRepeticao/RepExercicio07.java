/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacosRepeticao;
import java.util.Scanner;

/**
 *
 * @author Paula
 */
public class RepExercicio07 {
    public static void repEx07(String[] args) {
	Scanner ent = new Scanner(System.in);
        int fat = 1;
        int num;
        int cont = 1;
        do{
            System.out.println("Digite um nº");
            num = ent.nextInt();
            cont++;
            for(int i = 1; i <= num; i++){
              fat = fat * i;
            }
            System.out.println(num + "!" + " = " + fat);
        }while (cont < 6);
    }
}
