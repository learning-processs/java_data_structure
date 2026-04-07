package rec_Permutations;

import java.util.ArrayList;

// No. of function call depend of size of process char
// position -> no. of length + 1; e.g _a_ position ->2
public class Permutations {

    public static void main(String[] args) {
        
    // permutations("", "str");    


    ArrayList<String> ans = permutationsLists("", "abc");
    System.out.println(ans);
}

    static void permutations(String proc, String uproc){
        if(uproc.isEmpty()){
            System.out.println(proc);
            return;
        }

        char ch = uproc.charAt(0);

        for(int i = 0 ; i <=proc.length() ; i++){
            String f = proc.substring(0,i);
            String s = proc.substring(i, proc.length());
            permutations(f + ch + s, uproc.substring(1));
        }
    }


    static ArrayList<String> permutationsLists(String proc, String uproc){
        if(uproc.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }

        char ch = uproc.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0 ; i <=proc.length() ; i++){
            String f = proc.substring(0,i);
            String s = proc.substring(i, proc.length());
            ans.addAll(permutationsLists(f + ch + s, uproc.substring(1)));
        }
        return ans;
    }
}