class Games {
    int numPlayers;

    void rules() {

        System.out.println("umpire decision is final decision");
    }

}

class Cricket extends Games {
    Cricket(int numPlayers) {
        this.numPlayers = numPlayers;

    }

    void rules() {
        System.out.println("in cricket no of players are:" + numPlayers);
        System.out.println("if ypu're not satisfied with upire decision you can go for a review");

    }
}

public class SingleInher {
    public static void main(String[] args) {
        Games gd = new Games();
        gd.rules();
        Cricket cn = new Cricket(11);
        cn.rules();
    }

}
