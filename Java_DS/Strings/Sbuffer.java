package Strings;

public class Sbuffer {
    /// Mutable
    /// Efficient
    /// Thread safe ( complete the own work first and then allow others to work )
    /// String builder is not thread safe
    /// 
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        StringBuffer sb2 = new StringBuffer("Anu");

        StringBuffer sb3 = new StringBuffer(30);

        sb.append(" <- Anu -> ");
        sb.append(" <- Vinayak ->");

        sb.replace(4, 8, "kittu");

        String str = sb.toString();
        System.out.println(str);
    }
}
