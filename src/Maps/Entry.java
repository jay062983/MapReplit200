package Maps;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
public class Entry {
    public static void main(String[] args) {
        /*Create a HashMap of String.
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all the values in upper case using entrySet
**Expected Output:**
265
22180
PATRICK ST
UNITED STATE
VIENNA
```*/
        HashMap<String,String>map=new HashMap<>();
        map.put("Street","Patrick ST");
        map.put("Suit","265");
        map.put("City","Vienna");
        map.put("Zip","22101");
        map.put("Country","United States");
Set<Map.Entry<String,String>>entrySet=map.entrySet();
       for(Map.Entry<String,String> entry:entrySet){
           System.out.println(entry.getKey().toUpperCase());

       }


    }
}
