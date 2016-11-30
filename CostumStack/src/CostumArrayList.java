/**
 * Created by Samson on 02-11-2016.
 */
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Samson on 30-09-2016.
 */

// Simple first version of LinkedIntList with just a constructer
// and a methods for add and toString
public class CostumArrayList<T>{
    public T[] ts;        // first value in the list
    private int count;

    // post: construct an empty list
    public CostumArrayList(){
        ts = (T[]) new Object[1]; // cast (converter) et nyt Objet til T
        count = 0;
    }

    // post: returns the current number of elements in the list
    public int size(){

        for(int i = 0; i < ts.length; i++){
            if(ts[i] == null){
                //return i + 1;
            }
        }
        return count;
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public T get(int index){
        if(index < ts.length){
            if(ts[index] != null){
                return ts[index];
            }
        }

        return null;
    }


    // post: appends the given value to the end of the list
    public void add(T value){
        if(ts[ts.length - 1] == null){
            ts[count] = value;
            count++;
        } else {
            T[] temp = (T[]) new Object[ts.length * 2]; // Temp Array doublesize of original array
            for(int i = 0; i < ts.length; i++){
                temp[i] = ts[i];
            }
            ts = temp;
            add(value); // calls method within method (recurserve)
        }
    }


    // pre : o <= index < size()
    // post: removes value at the given index
    public void remove(int index){
        int removeCount = 0;                          // removes the given index
        if(ts.length > index){
            ts[index] = null;
            T[] temp = (T[]) new Object[ts.length -1]; // Temp Array doublesize of original array
            for(int i = 0; i < ts.length; i++){
                if(ts[i] != null ){
                    temp[removeCount] = ts[i]; // asign object in ts to temp array
                    removeCount++;
                }

            }
            ts = temp;
            count--;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(ts);
    }
}
