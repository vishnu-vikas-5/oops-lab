interface Playable {
    void play();
}

class Football implements Playable {

    @Override
    public void play() {
        System.out.println("Playing football with 11 players.");
    }
}
class Basketball implements Playable {

    @Override
    public void play() {
        System.out.println("Playing basketball with 5 players.");
    }
}

class Volleyball implements Playable {
    public void play() {
        System.out.println("Playing volleyball with 6 players.");
    }
}
public class SportsTest {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable basketball = new Basketball();
        Playable volleyball = new Volleyball();

        football.play();
        basketball.play();
        volleyball.play();
    }
}
