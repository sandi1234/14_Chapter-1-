/**
 * Created by Samson on 02-11-2016.
 */
public class CostumStack<E> {

    private CostumArrayList<E> list = new CostumArrayList<>();

    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize() - 1);
    }

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty(){
        if(getSize() != 0){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "stack: " + list.toString();
    }
}
