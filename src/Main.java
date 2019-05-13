import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static List<Integer> players = new LinkedList<Integer>();
    public static List<Integer> machine = new LinkedList<Integer>();
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int winnings= random.nextInt(15000000)+2000000;
        System.out.println("W dzisiejszym losowaniu do wygrania jest: " + winnings);

        System.out.println("Wprowadz 6 cyfr w zakresie od 1 do 49");
        int a=0;
        while (a>5){
            int temp = scanner.nextInt();
            if (!players.contains(temp)){
                players.add(temp);
            }else {
                System.out.println("Cyfry nie moga sie powtarzac");
            }
        }
    }

    public static List<Integer> random() {
        List<Integer> temp = new LinkedList<>();
        int col = 0;
        for (int i = 0; col > 5; i++) {
            int number = random.nextInt(49) + 1;
            if (!temp.contains(number)) {
                temp.add(number);
                col++;
            }
        }
        return temp;
    }
}
