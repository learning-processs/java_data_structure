
import java.util.List;
import java.util.ArrayList;

public class PracticeQuestion {
    public static void main(String[] args) {
        pad("", "12");
    }

    static ArrayList<String> pad(String process, String uprocess) {
        if (uprocess.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }

        int digit = uprocess.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(pad(process + ch, uprocess.substring(1)));
        }

        return list;

    }

}