/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacosRepeticao;

/**
 *
 * @author Paula
 */
public class RepExercicio06 {
    public static void repEx06(String[] args) {
        int fat = 1;
        int num = 10;
        int cont = 1;
        do{
            for(int i = 1; i <= num; i++){
                fat = fat * i;
            }
            System.out.println(num + "!" + " = " + fat);
            cont++;
        }while(cont < 2);
    }
}
