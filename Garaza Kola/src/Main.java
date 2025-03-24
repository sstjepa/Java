import prevoz.*;

public class Main {
    public static void main(String[] args) {
        SUSAuto susAuto1 = new SUSAuto(200, 300,  "benzin");
        SUSAuto susAuto3 = new SUSAuto(250, 300,  "dizel");
        SUSAuto susAuto4 = new SUSAuto(360, 300,  "benzin");
        SUSAuto susAuto2 = new SUSAuto(500, 300,  "dizel");
        ElektricniAuto elektricniAuto1 = new ElektricniAuto(150, 200,  100);

        Garaza garaza = new Garaza();
        garaza.ubaciAuto(susAuto1);
        garaza.ubaciAuto(susAuto2);
        garaza.ubaciAuto(susAuto3);
        garaza.ubaciAuto(susAuto4);
        garaza.ubaciAuto(elektricniAuto1);

        SUSAuto susAuto5 = new SUSAuto(200, 300,  "benzin");
        SUSAuto susAuto6 = new SUSAuto(250, 300,  "dizel");
        SUSAuto susAuto7 = new SUSAuto(360, 300,  "benzin");
        SUSAuto susAuto8 = new SUSAuto(500, 300,  "dizel");
        ElektricniAuto elektricniAuto2 = new ElektricniAuto(150, 200,  100);

        garaza.ubaciAuto(susAuto5);
        garaza.ubaciAuto(susAuto6);
        garaza.ubaciAuto(susAuto7);
        garaza.ubaciAuto(susAuto8);
        garaza.ubaciAuto(elektricniAuto2);
        SUSAuto susAuto9 = new SUSAuto(200, 300,  "benzin");
        SUSAuto susAuto10 = new SUSAuto(250, 300,  "dizel");
        SUSAuto susAuto11 = new SUSAuto(360, 300,  "benzin");
        SUSAuto susAuto12 = new SUSAuto(500, 300,  "dizel");
        ElektricniAuto elektricniAuto3 = new ElektricniAuto(150, 200,  100);


        garaza.ubaciAuto(susAuto9);
        garaza.ubaciAuto(susAuto10);
        garaza.ubaciAuto(susAuto11);
        garaza.ubaciAuto(susAuto12);
        garaza.ubaciAuto(elektricniAuto3);
        SUSAuto susAuto15 = new SUSAuto(200, 300,  "benzin");
        SUSAuto susAuto13 = new SUSAuto(250, 300,  "dizel");
        SUSAuto susAuto14 = new SUSAuto(360, 300,  "benzin");
        SUSAuto susAuto16 = new SUSAuto(500, 300,  "dizel");
        ElektricniAuto elektricniAuto4 = new ElektricniAuto(150, 200,  100);


        garaza.ubaciAuto(susAuto15);
        garaza.ubaciAuto(susAuto14);
        garaza.ubaciAuto(susAuto13);
        garaza.ubaciAuto(susAuto16);
        garaza.ubaciAuto(elektricniAuto4);

        

        garaza.megaTest();
        garaza.stampaj();
        garaza.ucitaj();
    }
}