import java.util.*;
import java.io.*;
/** Text Analyzer class Summary with Word Ocurrence **/
public class TextAnalyzerJavadoc

{ /** This method controls the access to the poem file to then apply the function rules **/
    public static void main(String[] args) throws FileNotFoundException {

        var file = new File("src/Poem.txt");
        var scan = new Scanner(file);
        java.util.HashMap<java.lang.String, java.lang.Integer> stringIntegerHashMap;
        stringIntegerHashMap = new HashMap<String, Integer>();

        while (true)
         /** if statements **/
        { if (!scan.hasNextLine()) break;
            java.lang.String string = scan.next();

            if (stringIntegerHashMap.containsKey(string) != false) { int count = (int)(stringIntegerHashMap.get(string));
                stringIntegerHashMap.remove(string);
                stringIntegerHashMap.put(string,count+1); } else stringIntegerHashMap.put(string, 1);
        }
        Set<Map.Entry<String, Integer>> set = stringIntegerHashMap.entrySet();

        List<Map.Entry<String, Integer >>
                sortedList = new ArrayList<Map.Entry<String, Integer>>(set);
        Collections.sort( sortedList,
                new Comparator<Map.Entry<String, Integer>>()
                {
                    public java.util.Map.Entry<java.lang.String, java.lang.Integer> b;

                    public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer>b)
                    {
                        this.b = b;
                        int c = b.getValue().compareTo(a.getValue());
                        return c;
                    }

                    @java.lang.Override
                    public boolean equals(java.lang.Object obj) {
                        return false;
                    }
                } ); /** results for values  **/
        for
        (Map.Entry<String, Integer> i:sortedList){
            System.out.println(i.getKey()+" =>>>>= "+i.getValue());
        }
    }
}