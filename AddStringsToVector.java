import java.util.Vector;
public class AddStringsToVector {
    public static void main(String[] args) {
        Vector<String> stringVector = new Vector<>();

        // Number of strings to add
        int n = 5;

        // Add n strings to the vector
        for (int i = 1; i <= n; i++) {
            String input = "String " + i;
            stringVector.add(input);
        }

        // Display the contents of the vector
        System.out.println("Strings added to the vector:");
        for (String str : stringVector) {
            System.out.println(str);
        }
    }
}
