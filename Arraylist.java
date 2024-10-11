import java.util.Arraylist;

public class Arraylist {
    public static void main(String[] args) {
        //Create an Arraylist of Strings
        Arraylist<String> list = new Arraylist<String>();

        //Add elements to the Arraylist
        list.add("Passion fruit");
        list.add("Watermelon");
        list.add("Mango");

        //Display the elements in the Arraylist
        System.out.println("Elements in the Arraylist;");
        for (String fruit: list) {
            System.out.println(fruit);
        }
    }
}