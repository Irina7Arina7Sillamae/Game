
package game;

import java.util.Random;
import java.util.Scanner;

public class Game {

   
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(5-0+1)+0;
        System.out.println("Программа загадала число от 0 до 5, отгадай: ");
     
        Scanner scanner = new Scanner(System.in);
        int usernum = scanner.nextInt();
        if(usernum == num) {
            System.out.println("Вы угадали!!! Молодец!!!");
        } else {
            System.out.println("Ты проиграл : задумано число: " + num + " Очень жаль!");
        }
        
        
        
        }   
}
