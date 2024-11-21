public class MusicHall {
    private Sector sector1;
    private Sector sector2;
    private Sector sector3;
    private Sector sector4;
    private Sector sector5;
    private Sector sector6;
    private Sector sector7;

    // parametrický konstruktor
    public MusicHall(Sector s1, Sector s2, Sector s3, Sector s4, Sector s5, Sector s6, Sector s7) {
        this.sector1 = s1;
        this.sector2 = s2;
        this.sector3 = s3;
        this.sector4 = s4;
        this.sector5 = s5;
        this.sector6 = s6;
        this.sector7 = s7;
    }

    // metody
    public int getSumOfSeatingPlaces() {
        int sum = 0;
        for (Sector sector : new Sector[]{sector1, sector2, sector3, sector4, sector5, sector6, sector7}) {
            sum += sector.getSeatingPlaces();
        }
        return sum;
    }

    public int getSumOfSeatingPlaces(String onlyForColor) {
        int sum = 0;
        for (Sector sector : new Sector[]{sector1, sector2, sector3, sector4, sector5, sector6, sector7}) {
            if (sector.getColor().equals(onlyForColor)) {
                sum += sector.getSeatingPlaces();
            }
        }
        return sum;
    }

    public int getSumOfStandingPlaces() {
        int sum = 0;
        for (Sector sector : new Sector[]{sector1, sector2, sector3, sector4, sector5, sector6, sector7}) {
            sum += sector.getStandingPlaces();
        }
        return sum;
    }

    public int getSumOfStandingPlaces(String onlyForColor) {
        int sum = 0;
        for (Sector sector : new Sector[]{sector1, sector2, sector3, sector4, sector5, sector6, sector7}) {
            if (sector.getColor().equals(onlyForColor)) {
                sum += sector.getStandingPlaces();
            }
        }
        return sum;
    }

    public void printInfo() {
        System.out.println("Detailní informace o sektorech: ");
        Sector[] sectors = new Sector[]{sector1, sector2, sector3, sector4, sector5, sector6, sector7};
        for (Sector sector : sectors) {
            sector.printInfo();
            System.out.println("\n");
        }
    }
}