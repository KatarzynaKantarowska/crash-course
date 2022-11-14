package instrukcjeWarunkowe;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        //ang. conditional statements

        int wiek = 15;
        boolean przyszedłTata = false;
        boolean przyszedłzMama = false;

        if (wiek >= 18) {
            System.out.println("Pozwól na zakup papierosów");
        } else if (przyszedłTata == true){
            System.out.println("Od razu podaj");
        } else if(wiek < 18 && przyszedłzMama) {
            System.out.println("Pozwól im na zakup");
        }else {
            System.out.println("Wyproś ze sklepu!");
        }
    }
}
