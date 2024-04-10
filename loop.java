 public class loop {
    public static void main (String[] args){
        int value = 7;

       /*  while (value < 10) {
            System.out.println(value);
            value++;
        }
        System.out.println(value); */

        do {
            System.out.println("i love you");
            value++;
        }
        while(value < 5);
    
 int i;
    for (i = 0; i < 10; i += 2) {
        System.out.println("i love you");
         }

         String[] array = {
            "apple",
            "orange",
            "peel",
            "perl"
         };

         for (String fruit : array) {
            System.out.println(fruit);
         }

         int[][] dan = {{30,40,70}, {20,10,50}};
         System.out.println(dan[0][0]);
    }
 }
