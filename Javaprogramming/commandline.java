public class commandline {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("enter name age and gender");
            return;
        }
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        char gender = args[2].charAt(0);
        System.out.println("name :" + name);
        System.out.println("age :" + age);
        System.out.println("gender :" + gender);

    }

}
