package execute;

import java.util.Arrays;
import java.util.Collections;

public class LearnArray {
    public void stringArray() {
        String[] myList = {"Florida","California","Georgia", "Texas"};
        for (int i = 0; i < myList.length; i++) {
            System.out.println("State name is: " + myList[i]);
        }
    }
    public void sortArray() {
        String[] myList = {"Florida","California","Georgia", "Texas"};
        Arrays.sort(myList);
        System.out.println(Arrays.toString(myList));
    }

    public void sortArrayInDescendingOrder() {
        String[] myList = {"Florida","California","Georgia", "Texas"};
        Arrays.sort(myList, Collections.reverseOrder());
        System.out.println(Arrays.toString(myList));
    }

}
