public class more {
    public static void main(String[] args) {
       String newMsg = "\"Hi\", welcome to java";
        String oldMsg = "daniel ";
        System.out.println(newMsg.length());
        System.out.println(newMsg.toUpperCase());
        System.out.println(newMsg.toLowerCase());

        System.out.println(newMsg.indexOf("w"));
        System.out.println(newMsg.indexOf("welcome"));

        System.out.println(oldMsg.concat( newMsg));
         
         int choice = 1;
        switch (choice) {
            case 1 :
            System.out.println("this is one");
            break;
            case 2:
            System.out.println("this is two");
            break;
            default :
            System.out.println("empty");
        }
            int value = 0;

            while (value < 5) {
                System.out.println(value);
                value++;
            }
            System.out.println(value);
        }
    }
