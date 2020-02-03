package one;

public class ClassEnheritence extends FootballClubs {
String players;
    public ClassEnheritence(String name, int clubYear, int trophies, String colorOfJerseys, String players) {
        super(name, clubYear, trophies, colorOfJerseys);
        this.players=players;
    }

    public void setPlayers(String players) {
        this.players = players;
    }

    public String getPlayers() {
        return players;
    }

    public static void main(String[] args) {
        ClassEnheritence test = new ClassEnheritence("blabla", 3232, 24, "red", "faf,safsa");
        System.out.println(test.getPlayers());
    }
    
}
