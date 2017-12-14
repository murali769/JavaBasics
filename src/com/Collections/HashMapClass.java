import java.util.HashMap;
import java.util.Map;

public class HashMapClass {


    public static void main(String[] args) {


        Map<Character,Integer> myMap=new HashMap<Character, Integer>();

        String input="Hi Ravi";

        for(int i=0;i<input.length();i++) {

            Character c = input.charAt(i);
            Integer value = myMap.get(c);
            //System.out.println(c);
            //System.out.println(value);
            if (value == null) {
                myMap.put(c, 1);

            } else {
                myMap.put(c, value + 1);

            }
        }
        System.out.println(myMap.toString());
        //System.out.println(myMap.get(c));

        for(Map.Entry<Character,Integer> entry: myMap.entrySet()){

            if(entry.getValue()==2) {
                System.out.println(entry.getKey());
            }
        }
        for(Character c1:myMap.keySet()){

            System.out.println(c1);
            myMap.put(c1,myMap.get(c1)+1);

        }
        System.out.println(myMap.toString());



    }

}

