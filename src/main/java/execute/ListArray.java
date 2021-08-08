package execute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArray {
    List<String> lists = new ArrayList<>();

    public void addValueToTheList() {
        lists.add("One");
        lists.add("Two");
        lists.add("Three");
    }

    public void readValueFromTheList() {
        System.out.println(lists);

        for(int i = 0; i < lists.size(); i++) {
            System.out.println("Print value using for loop indexing: " + lists.get(i));
        }

        for(String list:lists) {
            System.out.println("Print value using for loop " + list);
        }
    }

    public void removeValueFromTheList() {
        lists.remove("Two");
    }

    public void convertArrayToList() {
        String[] array = {"Java", "Python", "PHP", "C++"};
        System.out.println("Printing Array: " + Arrays.toString(array));

        //Converting Array to List
        List<String> list = new ArrayList<>();
        for(String lang:array) {
            list.add(lang);
        }
        System.out.println("Printing List: " + list);
    }

    public void covertListToAnArray() {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");

        //Converting List to Array
        String[] array = fruitList.toArray(new String[fruitList.size()]);
        System.out.println("Printing Array: " + Arrays.toString(array));
        System.out.println("Printing List: " + fruitList);
    }

}
