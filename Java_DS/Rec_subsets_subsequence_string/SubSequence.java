package Rec_subsets_subsequence_string;

import java.util.ArrayList;

// [3, 5, 9] => [3], [5], [9], [3, 5],[3,9] [5, 9], [3,5,9],
// Can't change the order in subset;
// here it ignore and take few element => pattern (subset)
// Subsequence => String
// Subset => Arrays
public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";  // a, b, c, ab, ac, bc, abc
        subSequence(str, " ");
        subSequenceAscii("abc", " ");


        System.out.println(subSequence2(str, " "));
        
    }

    static void subSequence(String unprocessed ,String processed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subSequence(unprocessed.substring(1), processed + ch);
        subSequence(unprocessed.substring(1), processed);
    }

    static ArrayList<String> subSequence2(String unprocessed ,String processed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);
        ArrayList<String> left = subSequence2(unprocessed.substring(1), processed + ch);
        ArrayList<String> right =subSequence2(unprocessed.substring(1), processed);
        left.addAll(right);
        return left;
    }

    static void subSequenceAscii(String unprocessed ,String processed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subSequenceAscii(unprocessed.substring(1), processed + ch);
        subSequenceAscii(unprocessed.substring(1), processed);
        subSequenceAscii(unprocessed.substring(1), processed + (ch + 0));
    }
}
