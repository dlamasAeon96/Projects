import java.util.*;

import static java.util.Collections.sort;

public class TextAnalyzer {
    public final List<Map.Entry<String, Integer>> sortedList;
    private final int wordCount;
    public TextAnalyzer(String text) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();
        String[] words=text.split("\\s");
        wordCount= words.length;
        for (String string : words) {
            if (stringIntegerHashMap.containsKey(string)) {
                int count = (int) (stringIntegerHashMap.get(string));
                stringIntegerHashMap.remove(string);
                Integer integer = stringIntegerHashMap.put(string,
                        count + 1);
            } else stringIntegerHashMap.put
                    (string, 1);
        }
        Set<Map.Entry<String, Integer>> set = stringIntegerHashMap.entrySet();
        sortedList = new ArrayList<Map.Entry<String, Integer>>(set);
        sort(sortedList, new Comparator<Map.Entry<String, Integer>>() {
            public Map.Entry<String, Integer> b;
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                this.b = b;
                int c = b.getValue().compareTo(a.getValue());
                return c;
            }
            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });
    } public String result(){
        StringBuilder stringBuffer=new StringBuilder();
        for (Map.Entry<String, Integer> i : sortedList) {
            stringBuffer.append(i.getKey()).append(" =>>>>= ").append(i.getValue()).append('\n');
        }
        return stringBuffer.toString();
    }

    public int getWordCount() {
        return wordCount;
    }
}



