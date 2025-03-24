public class Main {
    public static void main(String[] args) {
        Restoran papak = new Restoran();

        Konobar k1 = new Konobar("Milinko");
        Konobar k2 = new Konobar("Radojko");
        Konobar k3 = new Konobar("Alempije");

        Gost g1 = new Gost("aaaa aaaa aaaa");
        Gost g2 = new Gost("bbbb bbbb bbbb");
        Gost g3 = new Gost("cccc cccc cccc");
        Gost g4 = new Gost("dddd dddd dddd");

        papak.zaposli(k1);
        papak.zaposli(k2);
        papak.zaposli(k3);

        papak.ugosti(g1);
        papak.ugosti(g2);
        papak.ugosti(g3);
        papak.ugosti(g4);



        papak.posluzi();

    }
}
