class Devices {
    public void ios() {
        System.out.println("parent Devices");
    }

}

class Mobile extends Devices {
    public void andriod() {

        System.out.println("child Mobile");

    }
}

public class cover extends Mobile {
    public void c1() {
        System.out.println(" covers");

    }

    public static void main(String args[]) {
        cover obj = new cover();
        obj.ios();
        obj.andriod();
        obj.c1();

    }
}
