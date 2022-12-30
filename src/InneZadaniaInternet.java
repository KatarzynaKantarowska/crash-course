import java.util.Scanner;

public class InneZadaniaInternet {
    public static void main(String[] args) {

        String zdanie;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz dowolne zdanie");
        zdanie = scanner.nextLine();
        System.out.println(zdanie.toUpperCase());

    }
}
