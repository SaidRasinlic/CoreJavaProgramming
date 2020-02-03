package zadatakgender;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private final String name;
    private final String surname;
    private final Gender gender;
    private final LocalDate birthday;

    public Person(String name, String surname, Gender gender, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;

    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        int years = birthday.until(currentDate).getYears();
        return years;
     
    }

    @Override
    public String toString() {
        return name + "," + surname + ", " + gender.getName()+ ", " + birthday.toString();

    }

    public static List<Person> socialNetwork() {
        List<Person> socialNetworkList = new ArrayList<>();
      
        socialNetworkList.add(new Person("Said", "Rasinlic", Gender.MALE, LocalDate.of(2000, Month.JANUARY, 14)));
        socialNetworkList.add(new Person("Senad", "Rasinlic", Gender.MALE, LocalDate.of(1992, Month.DECEMBER, 4)));
        socialNetworkList.add(new Person("Lamija", "Rasinlic", Gender.FEMALE, LocalDate.of(1994, Month.JULY, 17)));

        return socialNetworkList;

    }
}
