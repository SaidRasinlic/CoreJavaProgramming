package one;

public class FootballClubs {

    private String name;
    private int clubYear;
    private int trophies;
    private String colorOfJerseys;

    public FootballClubs(String name, int clubYear, int trophies, String colorOfJerseys) {
        this.name = name;
        this.clubYear = clubYear;
        this.trophies = trophies;
        this.colorOfJerseys = colorOfJerseys;
    }

    public int getTrophies() {
        return trophies;
    }

    public String getName() {
        return name;
    }

    public String getColorOfJerseys() {
        return colorOfJerseys;
    }

    public int getClubYear() {
        return clubYear;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColorOfJerseys(String colorOfJerseys) {
        this.colorOfJerseys = colorOfJerseys;
    }

    public void setClubYear(int clubYear) {
        this.clubYear = clubYear;
    }

    public static void main(String[] args) {
          FootballClubs club3 = new FootballClubs("Everton", 1900, 6, "dark-blue");
        FootballClubs club = new FootballClubs("Manchester United", 1880, 22, "red");
        FootballClubs club1 = new FootballClubs("Manchester City", 1882, 18, "blue");
        FootballClubs club2 = new FootballClubs("Liverpool", 1883, 21, "white");
        System.out.println("Name of club is: " + club.getName() + "\nClub year: " + club.getClubYear() + "\nNumber of trophies: " + club.getTrophies() + "\nJersey color is: " + club.getColorOfJerseys());
               System.out.println(club3.getClubYear());
    }
    
    
    
    
}
