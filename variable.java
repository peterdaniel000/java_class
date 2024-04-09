import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
      /*   Declare and Define variable
         String name = "Daniel";
        int age = 20;

        System.out.println(name + " is " + age + " years old");
        age = 21;
        
        System.out.println(name + " is " + age + " years old");

        float dan = 10.75f;

       // int  newTemp = 30;
       // System.out.println(newTemp);
       // double oldtemp = newTemp;
       // System.out.println(oldtemp);

        double oldtemp = 12.55d;
        System.out.println(oldtemp);
        int newtemp = (int) oldtemp;

        System.out.println(newtemp);

        int first = 12;
        int second = 34;

        System.out.println(first + second);
        */

       // int maxValue = Math.min(6, 9);
      //  System.out.println(maxValue);

      double round = Math.round(35.465);
      double roundg = Math.round(35.554);

      System.out.println(round);
      System.out.println(roundg);

      double newNum = Math.ceil(11.076);
      System.out.println(newNum);

      double newNUMP = Math.floor(12.343f);
      System.out.println(newNUMP);

      double adds = Math.abs(-15.9);
      System.out.println(adds);

      double root = Math.sqrt(81);
      System.out.println(root);

      double random = Math.random();
      System.out.println(random);
      int random2 = (int) (Math.random() * 100);
      System.out.println(random2);
        Scanner scan = new Scanner(System.in);
        String name;

        System.out.println("What is your name: ");
        name = scan.nextLine();
        System.out.println("your name is "+ name);

        // type your name and your number

        System.out.println("type your name and your number: ");
        String nameEntered = scan.next();
        int age = scan.nextInt(); 

        System.out.println(nameEntered);
        System.out.println("you are " + age + " years old ");

    }
}
