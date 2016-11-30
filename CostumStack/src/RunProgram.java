/**
 * Created by Samson on 02-11-2016.
 */
public class RunProgram {
    public static  void main(String[] args){
        int[] data = {2, 4, 6, 8, 10, 12, 14, 16};

        CostumStack<Integer> s = new CostumStack<>();

        for(Integer str : data){
            s.push(str);
        }

        System.out.println("Costum Stack = " + s);
        System.out.println("Costum Stack size = " + s.getSize());
        System.out.println("Costum Stack peek = " + s.peek());

       while (!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }

        System.out.println();

    }
}
