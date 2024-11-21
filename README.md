Vytvořte program, který bude schopen uchovávat data o kapacitách sektorů koncertního sálu.

1) <b>Napište třídu Sector s privátními atributy</b>  
    • standingPlaces (int)  
    • seatingPlaces (int)  
    • nameOfSector (String)  
    • colorOfSector (String)  
   <br>

2) <b>V rámci třídy Sector implementujte parametrický konstruktor a metody</b>  
   • public Sector(String name, int standingPlaces, int seatingPlaces, String colorOfSector)  
   • public int getStandingPlaces()  
   • public int getSeatingPlaces()  
   • public String getColor()  
   • public void printInfo()  
   <br>

3) <b>Napište třídu MusicHall s privátními atributy</b>  
   • sector1 (Sector)  
   • sector2 (Sector)  
   • sector3 (Sector)  
   • sector4 (Sector)  
   • sector5 (Sector)  
   • sector6 (Sector)  
   • sector7 (Sector)  
   <br>

4) <b>V rámci třídy MusicHall implementujte parametrický konstruktor a metody</b>  
   • public MusicHall(Sector s1, Sector s2, Sector s3, Sector s4, Sector s5, Sector s6, Sector s7)  
   • public int getSumOfSeatingPlaces()  
   • public int getSumOfSeatingPlaces(String onlyForColor)  
   • public int getSumOfStandingPlaces()  
   • public int getSumOfStandingPlaces(String onlyForColor)  
   • public void printInfo()  
   <br>

5) Podle údajů na obrázku vytvořte datovou strukturu, naplňte daty a ověřte správnou funkcionalitu všech metod.

   ![image](https://github.com/user-attachments/assets/cda84c02-e222-4f50-b06b-f5524998dde8)
