package klasyAbstrakcyjneInterfejsy;

public class Zewnetrzna {
    int poleZewnetrzne;

    int metodaZewnetrzna(){
        Wewnetrzna obiektWewnetrzna = new Wewnetrzna();
        obiektWewnetrzna.metodaWewnetrzna();
        obiektWewnetrzna.poleWewnetrzne = 202;
        return -1;

    }

    class Wewnetrzna {
        int poleWewnetrzne;

        int metodaWewnetrzna() {
            metodaZewnetrzna();
            poleZewnetrzne = 101;

            return -2;
        }
    }
}
