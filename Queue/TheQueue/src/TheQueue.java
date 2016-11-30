/**
 * Created by Samson on 06-10-2016.
 */
import java.util.*;
public class TheQueue{

    private String[] queueArray;

    private int queueSize;

    private int front, rear, numberOfItem = 0;


    public static void main(String[] args){

        TheQueue queue = new TheQueue(10);

        queue.priorityInsert("100");
        queue.priorityInsert("50");
        queue.priorityInsert("40");
        queue.priorityInsert("30");


        queue.displayTheQueue();
        queue.peek();
        queue.remove();
        queue.displayTheQueue();



    }

    TheQueue(int size){

        queueSize = size;

        queueArray = new String[size];

        Arrays.fill(queueArray, "-1");

    }

    public void insert(String input){

        if(numberOfItem + 1 <= queueSize){
            queueArray[rear] = input;

            rear++;

            numberOfItem++;

            System.out.println("INSERT " + input + " Was Added");
        } else {
            System.out.println("Sorry But the Queue is Full");
        }
    }

    public void priorityInsert(String input){
        int i;

        if(numberOfItem == 0){

            insert(input);
        } else {

            for(i = numberOfItem - 1; i >= 0; i--){

                if(Integer.parseInt(input) > Integer.parseInt(queueArray[i])){

                    queueArray[i+1] = queueArray[i];

                } else break;
            }

            queueArray[i+1] = input;

            rear++; // update

            numberOfItem++; // update
        }
    }

    public void remove(){

        if(numberOfItem > 0){
            System.out.println("REMOVE " + queueArray[front] + " Was Removed");

            queueArray[front] = "-1";

            front++;

            numberOfItem--;
        } else {
            System.out.println("Sorry But the Queue is Empty");
        }
    }

    public void peek(){
        System.out.print("The First Element is " + queueArray[front] +" ");
    }

    public void displayTheQueue(){

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < queueSize; n++){

            System.out.format("| %2s "+ " ", n);

        }

        System.out.println("|");

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < queueSize; n++){


            if(queueArray[n].equals("-1")) System.out.print("|     ");

            else System.out.print(String.format("| %2s "+ " ", queueArray[n]));

        }

        System.out.println("|");

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

        // Number of spaces to put before the F

        int spacesBeforeFront = 3*(2*(front+1)-1);

        for(int k = 1; k < spacesBeforeFront; k++)System.out.print(" ");

        System.out.print("F");

        // Number of spaces to put before the R

        int spacesBeforeRear = (2*(3*rear)-1) - (spacesBeforeFront);

        for(int l = 0; l < spacesBeforeRear; l++)System.out.print(" ");

        System.out.print("R");

        System.out.println("\n");

    }
}