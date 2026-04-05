package Rec_subsets_subsequence_string;

// [3, 5, 9] => [3], [5], [9], [3, 5],[3,9] [5, 9], [3,5,9],
// Can't change the order in subset;
// here it ignore and take few element => pattern (subset)
// Subsequence => String
// Subset => Arrays
public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";  // a, b, c, ab, ac, bc, abc
        subSequence(str, " ");
        
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
}
