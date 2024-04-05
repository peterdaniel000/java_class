class daniel extends Exception{
    daniel() {
        super("you are not a peter family");
    }
}

class Application {
    private String name;
    private String surName;
    private int NumberInTheFamily;
    private int age;

    public Application(String name, String surName) {
        this.name = name;
        this.surName = surName;
        NumberInTheFamily = 10;
        age = 16;
    }

    public Application() {
        this("", "");
    }

    public void setNumberInTheFamily(int NumberInTheFamily) throws daniel {
        if (NumberInTheFamily > 10)
            throw new daniel();
        else
        this.NumberInTheFamily = NumberInTheFamily;
    }

    public void setAge(int age) throws daniel {
        if (age < 16)
            throw new daniel();
        else
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("The name of the family members: " + name);
        System.out.println("the sur name: " + surName);
        System.out.println("position in the family: " + NumberInTheFamily);
        System.out.println("age of the individual: " + age);
        System.out.println();
    }
}

public class learning {
    public static void main(String[] args) {
        Application application1 = new Application("daniel", "peter");
        Application application2 = new Application("isaiah", "peter");

        application1.displayDetails();

        try {
            application2.setAge(19);
            application2.setNumberInTheFamily(11);
        } catch (daniel e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}