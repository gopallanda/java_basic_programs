class Animal {
    int numLegs;

    void sound() {
        System.out.println("different animals has different sounds");
    }

    void walkingStyle() {
        System.out.println("different animals have different walking style");
    }
}

class Apes extends Animal {
    void sound() {
        super.sound();
        System.out.println("apes:guhhhhh!!!");
    }

    void walkingStyle() {
        System.out.println("apes are creeping");
    }
}

class Humans extends Apes {
    int numHands;

    Humans(int numLegs, int numHands) {
        this.numHands = numHands;
        this.numLegs = numLegs;
    }

    void sound() {
        System.out.println("humans can talk");
    }

    void walkingStyle() {
        super.sound();
        System.out.println("humans can walk");
    }
}

public class multiLevelInher {
    public static void main(String[] args) {
        Humans hs = new Humans(2, 2);
        hs.sound();
        hs.walkingStyle();
        super.sound();
    }

}
