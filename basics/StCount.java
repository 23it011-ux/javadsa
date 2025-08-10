package basics;
import java.util.HashMap;

public class StCount {
    public static void main(String[] args) {
        HashMap<Character, Integer> s = new HashMap<>();
        String st = "Java";

        for (char ch : st.toCharArray()) {
            s.put(ch, s.getOrDefault(ch, 0) + 1);
        }
        System.out.println(s);
    }
}
