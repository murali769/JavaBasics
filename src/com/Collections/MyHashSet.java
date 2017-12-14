import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MyHashSet {


    public static void main(String[] args) {


        Set<Integer> myset=new HashSet<Integer>();

        for(int i=0;i<=100;i++){

            if(i%2==0){

                myset.add(i+1);
            }else{

                myset.add(i);
            }

        }

        List<Integer> li=new LinkedList<Integer>();

        for(int i=0;i<=100;i++){

            if(i%2==0){

                li.add(i+1);
            }else{

                li.add(i);
            }

        }

        System.out.println(li.toString());
        System.out.println(myset.toString());



    }

}
