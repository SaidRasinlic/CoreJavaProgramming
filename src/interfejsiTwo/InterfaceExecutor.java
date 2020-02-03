package interfejsiTwo;

import sun.net.www.content.text.plain;

public class InterfaceExecutor {

    public static void main(String[] args) {
        
        
        
        NoiseMaker noiseMaker = new NoiseMaker() {
            @Override
            public String makeNoise() {
                return "Dynamic noise maker";

            }
        };
        NoiseMaker noiseMaker1 = () -> "make noise";
        CheckPerson femaleCheckPerson = new CheckPerson() {
            @Override
            public boolean check(Person person) {
                return person.getGender().equals(Gender.FEMALE);

            }
        };
        boolean result = femaleCheckPerson.check(new Person("Lamija", "Rasinlic", Gender.FEMALE));
        System.out.println(result);
        CheckPerson maleChecker = (Person p) -> {
            boolean result1 = p.getGender().equals(Gender.MALE);
            return result1;

        };

        String noise = noiseMaker.makeNoise();
        System.out.println(noise);

    }

}
