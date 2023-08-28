/**
 * An application class to test the generics classes.
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * Lab 1, Bags
 * Fall/2023
 * 
 */

public class Application {
    
    public static void main(String[] args) {

        GenericItem<String> stringItem = new GenericItem<>();
        stringItem.setItem("Bapaboi");

        GenericItem<Integer> integerItem = new GenericItem<>();
        integerItem.setItem(42);

        //Wildcard generic allows any type to be placed in GenericItem
        SmallBag<GenericItem<?>> smallBag = new SmallBag<>();
        smallBag.setItem(stringItem);
        System.out.println("Item in the bag: " + smallBag.getItem().getItem());

        smallBag.setItem(integerItem);
        System.out.println("Item in the bag: " + smallBag.getItem().getItem());
    }
}
