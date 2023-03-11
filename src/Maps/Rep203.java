package Maps;

import java.util.HashMap;
import java.util.Iterator;

public class Rep203 {
    public static void main(String[] args) {
      /*Create HashMap

add values as below

map.put("mango", 10);

map.put("apple", 30);

map.put("orange", 20);

map.put("mango", 40);

 map.put("mango", 40);

Using iterator retrieve all keys and values if the format below:

**Expected Output:**

```
Key = orange and value = 20
Key = apple and value = 30
Key = mango and value = 40
```
*/

        HashMap<String,Integer>map=new HashMap<>();
        map.put("mango", 10);

        map.put("apple", 30);

        map.put("orange", 20);

        map.put("mango", 40);

        map.put("mango", 40);
        var entrySet=map.entrySet();
        for(var entry:entrySet){
           System.out.println("key= "+ entry.getKey()+" "+"Value=" + entry.getValue());
        }

       var iterator=map.entrySet().iterator();
       while(iterator.hasNext());
       var entry=iterator.next();
        System.out.println(entry.getKey()+" "+ entry.getValue());



    }
}
