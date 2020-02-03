package one;

public class SoloLearn1 {

    public static void main(String[] args) {

        /*int x = 5;
        System.out.println(x);
        x = addToOne(x);
        System.out.println("van funkcije = " + x); */
        Person p = new Person("John");
        p.setAge(21);
        celebrateBirthday(p);
        System.out.println(p.getAge());

    }

    static void celebrateBirthday(Person p) {
        p.setAge(p.getAge() + 1);
    }

    /*   static int addToOne(int result) {

        result = result * result;
        System.out.println("u funkciji " + result);
        return result;

    } */
    public static class Person {

        private int age;

        Person(String name) {

        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

    }
}
