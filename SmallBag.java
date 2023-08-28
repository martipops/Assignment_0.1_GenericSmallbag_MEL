/**
 * A generic class representing a small bag that can hold an item of any type.
 *
 * @author Marti Lonnemann
 * @version 1.0
 * Lab 1, Bags
 * Fall/2023
 * 
 * @param <T> The type of item the bag can hold.
 */
class SmallBag<T> {
    private T item;

    /**
     * Get the item in the bag.
     *
     * @return The item in the bag.
     */
    public T getItem() {
        return item;
    }

    /**
     * Set the item in the bag.
     *
     * @param item The item to put in the bag.
     */
    public void setItem(T item) {
        this.item = item;
    }
}

