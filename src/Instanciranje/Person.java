package Instanciranje;

public class Person {

    private static int counter = 0;
    protected int age;
    String name;
    protected String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        counter++;
    }

    public void printPerson() {
        System.out.println("Ime: " + name + ", Prezime: " + surname);
    }

    public static void printCounter() {
        System.out.println("Broj objekata tipa Person = " + counter);
    }

}
