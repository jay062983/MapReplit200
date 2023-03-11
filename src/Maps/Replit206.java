package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Replit206 {
    public static void main(String[] args) {
        /*# Hash Map

Create a Hash Map of String pairs

add the follow values

map.put("ONE","AAA");

map.put("TWO","BBB");

map.put("THREE","CCC");

map.put("FOUR","DDD");

map.put("FIVE","EEE");

Using entry set print key and values pairs using loop

Remove below from Map

"ONE"

"FOUR"

Using entry set print key and values pairs using loop

**Expected Output:**

```
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC
```

  */


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
        System.out.println(map.remove("ONE","AAA"));
        System.out.println(map.remove("FOUR","DDD"));
        var iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());

}}}