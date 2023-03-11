package Maps;

import java.util.LinkedHashMap;

public class Rep207 {
    public static void main(String[] args) {
        /* Create Hash Map.

add the follow values

map.put("ONE","AAA");

map.put("TWO","BBB");

map.put("THREE","CCC");

map.put("FOUR","DDD");

map.put("FIVE","EEE");

Using EntrySet print the key and values pairs using iterator only

replace with below key THREE--> ASEL and key FIVE-->SUMAIR

Using EntrySet print the key and values pairs using iterator only

OUTPUT



```
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL

```*/


        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("ONE", "AAA");

        map.put("TWO", "BBB");

        map.put("THREE", "CCC");

        map.put("FOUR", "DDD");

        map.put("FIVE", "EEE");
        var entrySet = map.entrySet();

        for (var entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
        System.out.println(map.replace("THREE","TOM"));
        System.out.println(map.replace("FOUR", "DON"));
        var iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}