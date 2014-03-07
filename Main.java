package Transformers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by liam on 3/6/14.
 */
public class Main {
    static ArrayList<Transformer> transformers;
    static Scanner kb;

   public static void main(String[] args) {
       transformers = new ArrayList<Transformer>();

       // Add your transformer to the arraylist using the statement:
       //     transformers.add(new YourTransformerNameHere());
       // DON'T CHANGE ABOVE THIS LINE
       //---------------------------------------------------------------------------------------------------------------
       transformers.add(new ExampleTransformer());


       // DON'T CHANGE BELOW THIS LINE
       //---------------------------------------------------------------------------------------------------------------
       kb = new Scanner(System.in);
       String input;
       while (!(input = prompt()).equals("exit")) {
           for (Transformer t : transformers) {
               System.out.println(t.getName() + " says:\n" + t.transform(input) + "\n");
           }
       }
   }

    public static String prompt() {
        System.out.print("\n > ");
        return kb.nextLine();
    }
}
