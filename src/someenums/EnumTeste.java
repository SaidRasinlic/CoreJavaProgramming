package someenums;

import java.util.EnumSet;

public class EnumTeste {

    public static void main(String[] args) {

        GameState state = GameState.RUNNING;

        System.out.println(state.state_description);
        switch (state) {
            case RUNNING:
                System.out.println("I am running !");
                break;
            case PAUSED:
                System.out.println("Man Im on  pause");
                break;
            case STOPPED:
                System.out.println("Boi u made me quit!!");
                break;

        }

        String persisted_state = "RUNNING";
        GameState recovered = GameState.valueOf(persisted_state);
        System.out.println("State of  enum: " + recovered);

        System.out.println("Available game states: ");
        for (GameState st : GameState.values()) {
            System.out.println(st);
        }

        EnumSet states_range = EnumSet.range(GameState.PAUSED, GameState.STOPPED);
        for (Object st : states_range) {
            System.out.println("State is: " + (GameState) st);
        }

    }

}
