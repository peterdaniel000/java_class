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
    }
}
