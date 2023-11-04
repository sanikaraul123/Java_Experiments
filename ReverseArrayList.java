import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);
        ArrayList<Integer> reversedList = reverseArrayList(originalList);
        System.out.println("Original ArrayList: " + originalList);
        System.out.println("Reversed ArrayList: " + reversedList);
    }
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> originalList) {
        ArrayList<Integer> reversedList = new ArrayList<>();
        int size = originalList.size();
        for (int i = size - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }
        return reversedList;
    }
}
