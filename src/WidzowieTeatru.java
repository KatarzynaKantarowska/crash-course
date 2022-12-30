public class WidzowieTeatru {
    public static void main(String[] strings) {

        String [][] imionaKobiet = new String[50][2];
        String [][] imionaMezczyzn= new String[50][2];

        imionaKobiet[0] = new String[] {"Kasia",""};
        imionaKobiet[1] = new String[] {"Ilona",""};
        imionaKobiet[2] = new String[] {"Asia",""};
        imionaKobiet[3] = new String[] {"Patrycja",""};
        imionaKobiet[4] = new String[] {"Magda",""};
        imionaKobiet[5] = new String[] {"Oliwka",""};
        imionaKobiet[6] = new String[] {"Justynka",""};
        imionaKobiet[7] = new String[] {"Danusia",""};
        imionaKobiet[8] = new String[] {"Ola",""};
        imionaKobiet[9] = new String[] {"Ala",""};
        imionaKobiet[10] = new String[] {"Ela",""};
        imionaKobiet[11] = new String[] {"Łucja",""};
        imionaKobiet[12] = new String[] {"Krysia",""};
        imionaKobiet[13] = new String[] {"Sabina",""};
        imionaKobiet[14] = new String[] {"Basia",""};
        imionaKobiet[15] = new String[] {"Nina",""};
        imionaKobiet[16] = new String[] {"Paulina",""};
        imionaKobiet[17] = new String[] {"Marta",""};
        imionaKobiet[18] = new String[] {"Nadia",""};
        imionaKobiet[19] = new String[] {"Dorota",""};
        imionaKobiet[20] = new String[] {"Monika",""};

        imionaMezczyzn[0] = new String[] {"Mateusz",""};
        imionaMezczyzn[1] = new String[] {"Julek",""};
        imionaMezczyzn[2] = new String[] {"Czarek",""};
        imionaMezczyzn[3] = new String[] {"Boguś",""};
        imionaMezczyzn[4] = new String[] {"Michał",""};
        imionaMezczyzn[5] = new String[] {"Piotruś",""};
        imionaMezczyzn[6] = new String[] {"Szymek",""};
        imionaMezczyzn[7] = new String[] {"Marek",""};
        imionaMezczyzn[8] = new String[] {"Marcin",""};
        imionaMezczyzn[9] = new String[] {"Krzysiek",""};
        imionaMezczyzn[10] = new String[] {"Zbyszek",""};

        System.out.println("Rozmiar tablicy imion damskich to: " + imionaKobiet.length);
        System.out.println("Rozmiar tablicy imion męskich to: " + imionaMezczyzn.length);

        String [][] salaTeatru = new String[17][];
        salaTeatru[0]=new String[20];
        salaTeatru[1]=new String[23];
        salaTeatru[2]=new String[26];
        salaTeatru[3]=new String[27];
        salaTeatru[4]=new String[27];
        salaTeatru[5]=new String[27];
        salaTeatru[6]=new String[30];
        salaTeatru[7]=new String[31];
        salaTeatru[8]=new String[32];
        salaTeatru[9]=new String[33];
        salaTeatru[10]=new String[34];
        salaTeatru[11]=new String[33];
        salaTeatru[12]=new String[34];
        salaTeatru[13]=new String[30];
        salaTeatru[14]=new String[27];
        salaTeatru[15]=new String[25];
        salaTeatru[16]=new String[24];

        int los;
        for (int i = 0; i < salaTeatru.length ; i++) {
            for (int j = 0; j <salaTeatru[i].length ; j+=2) {
                do los = (int) (Math.random()*imionaMezczyzn.length);
                while (imionaMezczyzn[los][0]==null);
                salaTeatru[i][j]=imionaMezczyzn[los][0];
                imionaMezczyzn[los][1] += "x";
                do los = (int) (Math.random()*imionaKobiet.length);
                while (imionaKobiet[los][0]==null);
                if (salaTeatru[i].length>j+1) salaTeatru[i][j+1]=imionaKobiet[los][0];
                imionaKobiet[los][1] += "x";

                for (String[] ss:salaTeatru) {
                    for (String s:ss) System.out.println(s + " ");
                    System.out.println();

                }


            }

        }
        for (String[] s: imionaKobiet)
            if ((s[0] != null) && (!s[0].equals("")))
                System.out.printf("%s wystąpiło: %d razy \n\r", s[0], s[1].length());
        for (String[] s: imionaMezczyzn)
            if ((s[0] != null) && (!s[0].equals("")))
                System.out.printf("%s wystąpiło: %d razy \n\r", s[0], s[1].length());

    }
}
