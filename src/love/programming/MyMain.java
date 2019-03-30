package love.programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MyMain {
    public static void main(String[] args) {

        ArrayList myArrayList = new ArrayList();
        myArrayList.add("Bala");
        myArrayList.add("Anuradha");
        myArrayList.add("Sima");
        myArrayList.add("Deepa");
        myArrayList.add("Kalyani");
        myArrayList.add("Bobby");
        myArrayList.add("Nirupa");
        myArrayList.add("Uma");
        myArrayList.add("Suchitra");
        myArrayList.add("Narmada");
        myArrayList.add("Kalyani");
        System.out.println(myArrayList.size());

        HashSet myHashList = new HashSet();

        myHashList.add("Kalyani");
        myHashList.add("Pavan");
        myHashList.add("Aashi");
        myHashList.add("Aanvi");
        myHashList.add("Kalyani");
        System.out.println(myHashList.size());

        HashMap myHashMap = new HashMap();
        myHashMap.put(1,"One");
        myHashMap.put(2,"Two");
        myHashMap.put(2,"Three");
        myHashMap.put(2,"Four");
        System.out.println(myHashMap.get(2));



    }
}
