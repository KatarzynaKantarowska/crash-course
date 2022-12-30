import java.util.HashMap;
import java.util.Random;

public class Literaly {
    public static void main(String[] args) {
        Random random = new Random();
        String[] tab = new String[50];
        int ileLiter = 3;
        String wyraz;
        for (int i = 0; i < tab.length ; i++) {
            wyraz = "";
            for (int j = 0; j < ileLiter; j++)
                wyraz += Character.toString((char) (random.nextInt('Z' - 'A') + 'A'));
            System.out.println(tab[i] = wyraz);
        }
            HashMap<Character, Integer> hashMapa = new HashMap<>();

        for(String znak : tab)
            for (int i= 0; i < znak.length() ; i++) {
                if (hashMapa.containsKey(znak.charAt(i)))
                    hashMapa.replace(znak.charAt(i),(hashMapa.get(znak.charAt(i))+1));
                else hashMapa.put(znak.charAt(i), 1);
                System.out.println(hashMapa);

            }
        }
    }
