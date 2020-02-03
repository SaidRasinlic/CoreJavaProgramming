package firstpackage.person;

import Instanciranje.Person;

public class Teacher extends Person {

    private double salaryAmount;

    public Teacher(String name, String surname, double plata) {

        super(name, surname);
        this.salaryAmount = plata;

    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

}
