/**
 * A generic class to hold an item of any type.
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * Lab 1, Bags
 * Fall/2023
 * 
 * @param <T> The type of item being held.
 */

class GenericItem<T> {

    private T t;

    /**
     * Get the item.
     *
     * @return The item.
     */
    public T getItem() {
        return t;
    }

    /**
     * Set the item.
     *
     * @param t The item to set.
     */
    public void setItem(T t) {
        this.t = t;
    }
}