 import java.util.Scanner;
 
 
 class addition {
    Scanner scan = new Scanner(System.in);

    public int a;
    public int b;
    public String operators;

    public addition(int a, int b, String operators) {
        this.a = a;
        this.b = b;
        this.operators = operators;
    }

    public addition() {
        this(0, 0, "");

     /*    switch (operators) {
            case "/" :
            System.out.println(a / b);
            break;
            case "*" :
            System.out.println(a * b);
            break;
            case "+" :
            System.out.println(a + b);
            */
        }
    

    public void display() {
        System.out.println("Which operation do you want to do e.g +,-,*,/, %");
        operators = scan.next();
        System.out.println("Your fisrt value");
        a = scan.nextInt();
        System.out.println("Your second value");
        b = scan.nextInt();
        System.out.println("Your result is = ");

        switch (operators) {
            case "/" :
            System.out.println(a / b);
            break;
            case "*" :
            System.out.println(a * b);
            break;
            case "+" :
            System.out.println(a + b);
            break;
            case "-" :
            System.out.println(a - b);
            break;
            case "%" :
            System.out.println(a % b);
            break;
        
       // int y = a + b;
       // System.out.println("the answer is: "+ y );
        }
    }
}
