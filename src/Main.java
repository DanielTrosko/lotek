import java.util.*;

public class Main {
    private static List<Integer> players = new LinkedList<>();
    private static List<Integer> machine = new LinkedList<>();
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int winnings = random.nextInt(15000000) + 2000000;
        System.out.println("W dzisiejszym losowaniu do wygrania jest: " + winnings);

        System.out.println("Wprowadz 6 cyfr w zakresie od 1 do 49");
        int a = 0;
        while (a < 6) {
            try {
                int temp = scanner.nextInt();
                System.out.println("Wprowadz liczbe i wscisnij ENTER");
                if (!players.contains(temp) && temp > 0 && temp < 50) {
                    players.add(temp);
                    a++;
                } else {
                    System.out.println("Cyfry nie moga sie powtarzac");
                    System.out.println("Zakres cyfr to od 1 do 49");
                }
            } catch (InputMismatchException e) {
                System.out.println("Błąd! wprowadz liczbe od 1 do 49");
            }
            scanner.nextLine();
        }
        int b = 0;
        while (b < 6) {
            int temp = random.nextInt(48) + 1;
            if (!machine.contains(temp)) {
                machine.add(temp);
                b++;
            }
        }
        int wins = 0;
        for (int i = 0; i < 6; i++) {
            int temp = machine.get(i);
            if (players.contains(temp)) {
                wins++;
            }
        }
        Collections.sort(machine);
        Collections.sort(players);
        System.out.println("Wylosowane liczby to: " + machine);
        System.out.println("Twoje liczby to: " + players);
        System.out.println("Trafiłeś " + wins + " liczby");
        switch (wins) {
            case 0:
            case 1:
            case 2:
                System.out.println("Brak wygranej");
                break;
            case 3:
                System.out.println("Trafiłeś 3 cyfry Twoja wygrana to: " + winnings / 53467 + " zł");
                break;
            case 4:
                System.out.println("Trafileś 4 cyfry Twoja wygrana to: " + winnings / 3073 + " zł");
                break;
            case 5:
                System.out.println("Trafileś 5 cyfry Twoja wygrana to: " + winnings / 65 + " zł");
                break;
            case 6:
                System.out.println("Trafiłeś 6 głowna wygrana: " + winnings + " zł");
        }
    }
}
