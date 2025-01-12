import java.util.Arrays;

public class linearsearch {
    public static void main(String[] args) {
        String name = "lavi sharma";
        char target = 'n';
        System.out.println(Arrays.toString(name.toCharArray()));
        boolean result = linearseach(name, target);
        if (result == true) {
            System.out.println("character exits");
        } else {
            System.out.println("character does not exist");
        }
    }

    static boolean linearseach(String str, char target) {
        if (str.length() == 0) {
            System.out.println("name not present");
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}