package zadatakgender;

public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE"),
    OTHER("OTHER");
    
    private String name;

    private Gender(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }
}
