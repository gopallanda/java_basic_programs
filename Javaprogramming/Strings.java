import javax.xml.stream.events.Characters;

public class Strings {
    public static void main(String[] args) {
        int a = 20;
        char ch = 'G';
        Integer aObj = Integer.valueOf(a);
        Character chObj = Character.valueOf(ch);
        if (aObj instanceof Integer) {
            System.out.println("object is created for integer" + aObj);
        }
        if (chObj instanceof Character) {
            System.out.println("charcter object is created" + chObj);
        }
        int c = aObj.intValue();
        char p = chObj.charValue();
        System.out.println(c);
        System.out.println(p);

    }

}
