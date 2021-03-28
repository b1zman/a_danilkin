import java.util.Scanner;
public class Game {

    public static void main(String[] args) {
        System.out.println("Загадайте число от 1 до 10");
        System.out.println("Сейчас попробую отгадать...");
        int n = 0;
        do
        {
            int num1 = 1 + (int) (Math.random() * 10);
            System.out.println(num1);
            System.out.println("Введите ИИ 1-Отгадал, 2-Не отгадал");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
        }
        while(n!=1);

        }
        }