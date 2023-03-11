package Maps;

import java.util.HashMap;
import java.util.Map;

public class rep208 {
    public static void main(String[] args) {
        /*# HashMap, Methods, reusability, Logic
Create a Method in Main class using below specification.
Method Name: display.
Return Type: Void
Parameters : Map<String,Integer>
Logic:
First the method will check the given map is empty or not.
If the map is not empty print pairs of key and value using loops
If map is empty simply print "map is empty"
**NOW IN MAIN METHOD**
Create HashMap of String keys and Integer values
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
call above method with these arguments.
then clear the map.
and call above method again.

*/
   // void display(Map<String,Integer>);


        Map<String, Integer>map=new HashMap<>();

    map.put("Mango",10);
        map.put("Apple",30);
        map.put("Oranges",20);

        System.out.println(map.isEmpty());
        System.out.println(map);
        for (int i = 0; i < map.size(); i++) {

        }if(map.isEmpty())

        System.out.println("map is empty");


        }



        }








