public class Sector {
    private int standingPlaces;
    private int seatingPlaces;
    private String nameOfSector;
    private String colorOfSector;

    // parametrický konstruktor
    public Sector(String name, int standingPlaces, int seatingPlaces, String colorOfSector) {
        this.nameOfSector = name;
        this.standingPlaces = standingPlaces;
        this.seatingPlaces = seatingPlaces;
        this.colorOfSector = colorOfSector;
    }

    // metody
    public int getStandingPlaces() {
        return standingPlaces;
    }

    public int getSeatingPlaces() {
        return seatingPlaces;
    }

    public String getColor() {
        return colorOfSector;
    }

    public String getName() { // tato metoda doplněna navíc - volána ze třídy Main
        return nameOfSector;
    }

    public void printInfo() {
        System.out.println("Název sektoru: " + nameOfSector);
        System.out.println("Počet míst ke stání: " + standingPlaces);
        System.out.println("Počet míst k sezení: " + seatingPlaces);
        System.out.println("Barva sektoru: " + colorOfSector);
    }
}
