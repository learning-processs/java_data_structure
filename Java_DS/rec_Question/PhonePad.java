package rec_Question;
/*
    Take somthing and remove somthing...
    a->0, b->1, c->2, d->3, e->4, f->5
    2 ->abc 3->def , 4->fgh , 5->ijk, 6->lmn, 7->pqrs, 8->tuv, 9->wxyz
    output -> ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"];



    range => [(digit-1)*3 , digit * 3]

 */

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {

        String digits = "23";
        System.out.println(letterCombinationList("", digits));


        System.out.println(letterCombinationCount("", digits));
    }

    static void letterCombination(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // 2 ->abc 3->def

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);

            letterCombination(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> letterCombinationList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(letterCombinationList(p + ch, up.substring(1)));
        }
        return list;
    }

    static int letterCombinationCount(String process, String unprocess){
        if(unprocess.isEmpty()){
            return 1;
        }

        int count = 0;
        int digit = unprocess.charAt(0) - '0';
        for(int i = (digit - 1) * 3 ; i < digit * 3 ; i++){
            char ch = (char)('a' + i);
            count = count + letterCombinationCount(process + ch, unprocess.substring(1));
        }
        return count ;
    }
}
