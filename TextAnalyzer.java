import java.util.*;
import java.io.*;
public class TextAnalyzer
{



    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/textFile.txt");
        Scanner scan = new Scanner(file);
        Map<String,Integer> map = new HashMap<String, Integer>();
        while (scan.hasNextLine())
        {
            String val = scan.next();

            if(map.containsKey(val) == false)
                map.put(val,1);
            else
            {
                int count = (int)(map.get(val));
                map.remove(val);
                map.put(val,count+1);
            }
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<Map.Entry<String, Integer>>(set);
        Collections.sort( sortedList, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> a, Map.Entry<String, Integer> b )
            {
                return (b.getValue()).compareTo( a.getValue() );
            }
        } );

        for(Map.Entry<String, Integer> i:sortedList){
            System.out.println(i.getKey()+" -> "+i.getValue());
        }
    }
}


