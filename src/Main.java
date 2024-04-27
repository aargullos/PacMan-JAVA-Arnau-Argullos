import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 per català,2 for english, 3 para español, 4 pour le français:");
        int option = scanner.nextInt();
        scanner.nextLine();

        String misatjeBenvinguda = "";
        switch (option) {
            case 1:
                misatjeBenvinguda = "Benvingut a";
                break;
            case 2:
                misatjeBenvinguda = "Welcome to";
                break;
            case 3:
                misatjeBenvinguda = "Bienvenido a";
                break;
            case 4:
                misatjeBenvinguda = "Bienvenue à";
                break;
            default:
                System.out.println("Opció no valida.");
                return;
        }
        System.out.printf("%s Pacman!\n", misatjeBenvinguda);
    }
}