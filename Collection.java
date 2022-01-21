import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collection {

    class CollectionMethods{
        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList<String>();

            names.add("David");
            names.add("John");
            names.add("Maria");
            names.add("Carl");
            names.add("Paul");
            names.add("Andy");
            names.add("Jayce");
            names.add("Vanessa");
            System.out.println("Names:");
            for(String s : names){
                System.out.println(s);
            }
            System.out.println("\nAfter sorting: ");
            Collections.sort(names);
            for(String s : names){
                System.out.println(s);
            }
            System.out.println("\nAfter shuffle:");
            Collections.shuffle(names);
            for(String s : names){
                System.out.println(s);
            }
            String findElement = "John";
            String notFoundElement = "ABD";
            System.out.println("Positon of "+findElement+": "+names.indexOf(findElement));
            System.out.println("Positon of "+notFoundElement+": "+names.indexOf(notFoundElement));
            System.out.println("\nAfter converting to array:");
            String[] arr = new String[names.size()];
            arr = names.toArray(arr);
            for(String s : arr){
                System.out.println(s);
            }
            System.out.println("\nAfter converting to list:");
            List<String> list = Arrays.asList(arr);
            for(String s : list){
                System.out.println(s);
            }
        }
    }
}
