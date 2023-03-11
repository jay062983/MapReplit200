package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Rep204 {
    public static void main(String[] args) {
        /*Create a Map that will preserve an order of entry objects

Add below pair to it .

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Print all values using iterator

**Expected output:**

```
Patrick ST
265
Vienna
22180
United State
``` */

        LinkedHashMap<String,String>tmap=new LinkedHashMap<>();
        tmap.put("Street","Patrick St");
        tmap.put("Suit","265");
        tmap.put("City","Vienna");
        tmap.put("Zip","223134");
        tmap.put("Country","United States");
        var entySet=tmap.entrySet();
        for(var entry:entySet){
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
        var iterator=tmap.entrySet().iterator();
        while(iterator.hasNext());
        var entry=iterator.next();
        System.out.println(entry.getKey()+" "+entry.getValue());

    }
}
