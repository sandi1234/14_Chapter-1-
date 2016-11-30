/**
 * Created by Samson on 02-11-2016.
 */
/**
 * Created by Samson on 30-09-2016.
 */
// Listnode is a class for storing a single node of linked
// list. This node class is for a list of integer values

public class CostumNode<T> {
    public T data;        // data stored in this node
    public CostumNode next;   // link to next node in the list

    // post: constructs a node with data 0 and null link
    public CostumNode(){
        //this(0,null);
    }

    // post: constructs a node with data 0 and null link
    public CostumNode(T data){
        this(data, null);
    }

    // post: constructs a node with data 0 and null link
    public CostumNode(T data, CostumNode next){
        this.data = data;
        this.next = next;
    }
}