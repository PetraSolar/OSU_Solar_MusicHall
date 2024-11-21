public class Main  {
    public static void main(String[] args) {
        Sector sector1 = new Sector("F1", 150, 50, "modrá");
        Sector sector2 = new Sector("L1", 50, 80, "červená");
        Sector sector3 = new Sector("L2", 50, 80, "červená");
        Sector sector4 = new Sector("L3", 20, 40, "červená");
        Sector sector5 = new Sector("U1", 35, 95, "žlutá");
        Sector sector6 = new Sector("U2", 35, 95, "žlutá");
        Sector sector7 = new Sector("U3", 60, 70, "žlutá");

        MusicHall musicHall = new MusicHall(sector1, sector2, sector3, sector4, sector5, sector6, sector7);


     // Příklady výpisu informací o sektorech
        System.out.println("Počet míst ke stání v sektoru " + sector1.getName() + ": " + sector1.getStandingPlaces());

        System.out.println("Barva sektoru " + sector2.getName() + ": " + sector2.getColor());

        //sector3.printInfo();

     //Příklady výpisu informací o koncertní hale
        System.out.println("Celkový počet míst k sezení: " + musicHall.getSumOfSeatingPlaces());

        System.out.println("Celkový počet míst k sezení v modrém sektoru: " + musicHall.getSumOfSeatingPlaces("modrá"));

        System.out.println("Celkový počet míst ke stání: " + musicHall.getSumOfStandingPlaces());

        System.out.println("Celkový počet míst ke stání v červeném sektoru: " + musicHall.getSumOfStandingPlaces("červená"));

        //musicHall.printInfo();

    }
}
