/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacosRepeticao;

/**
 *
 * @author Paula
 */
public class RepExercicio04 {
    public static void repEx04(String[] args) {
        int num = 0;
        do {
            int res = num % 2;
            if (res == 0){
            System.out.println(num);
        }
        num++;
        } while ((num >= 1) && (num <= 100));
    }
}
