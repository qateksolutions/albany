package execute;

import java.util.HashMap;

public class Homework {
   public int[] arrayFirstElement(int[] a, int[] b) {
       int[] firstElement = { a[0], b[0] };
       return firstElement;
   }

   public int[] arrayMiddleElement(int[] a) { //[1,2,3,4] = [2,3]
       int middleIndex = a.length/2; // 2
       int[] middleArray = {a[middleIndex - 1], a[middleIndex]};
       return middleArray;
   }

   public int arraySummation(int[] a) {
       int sum = 0;
       for(int i=0; i < a.length; i++) {
           sum += a[i];
       }
       return sum;
   }

   public HashMap<String, Integer> word0(String[] strings) {
       HashMap<String, Integer> hashMap = new HashMap<>();

       for(String arr: strings) {
           if(hashMap.containsKey(arr) == false) {
               hashMap.put(arr, 0);
           }
       }

       return hashMap;
   }

    public HashMap<String, Integer> problem2(String[] strings) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(String arr: strings) {
            if(hashMap.containsKey(arr) == false) {
                hashMap.put(arr, arr.length());
            }
        }

        return hashMap;
    }

    public int[] fizzArray(int n) {
       int[] array = new int[n];
       if (n == 0) {
           return array;
       }
       for (int i=0; i < n; i++) {
           array[i] = i;
       }
       return array;
    }

    public int countHi(String str) {
       int counter = 0;
       for (int i = 0; i < str.length() - 1; i++) {
           String name = str.substring(i, i+2);
           System.out.println("i value: " + i);
           System.out.println("substring: " + name);
           if(name.equals("hi")) {
               counter++;
           }
           System.out.println("counter value:" +counter);
       }
       return counter;
    }

    public int loneSum(int a, int b, int c) {
       int sum = 0;
       if (a != b && a != c) {
           sum += a;
       }
       if (b != a && b != c) {
           sum += b;
       }
       if (c != a && c != b) {
           sum += c;
       }
       return sum;
    }



}
