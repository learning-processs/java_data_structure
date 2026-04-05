package Rec_subsets_subsequence_string;

public class StreamOfchar {

    public static void main(String[] args) {
        // skip("", "baccdah");

        // System.out.println(skip2("baccdah"));

        // System.out.println(skipApple("bcappled"));
        System.out.println(skipAppNotApple("bcappled"));
    }

    static void skip(String processed , String unprocessed ){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        if(ch == 'a'){
            skip(processed, unprocessed.substring(1));
        }else{
            skip(processed + ch, unprocessed.substring(1));
        }
    }


    static String skip2( String unprocessed ){
        if(unprocessed.isEmpty()){
            return " ";
        }

        char ch = unprocessed.charAt(0);
        if(ch == 'a'){
            return skip2( unprocessed.substring(1));
        }else{
           return ch + skip2(unprocessed.substring(1));
        }
    }


    static String skipApple( String unprocessed ){
        if(unprocessed.isEmpty()){
            return " ";
        }

        if(unprocessed.startsWith("apple")){
            return skipApple( unprocessed.substring(5));
        }else{
           return unprocessed.charAt(0) + skipApple(unprocessed.substring(1));
        }
    }

    // Skip app when not equal to apple ;

     static String skipAppNotApple( String unprocessed ){
        if(unprocessed.isEmpty()){
            return " ";
        }

        if(unprocessed.startsWith("app") && !unprocessed.startsWith("apple")){
            return skipAppNotApple( unprocessed.substring(3));
        }else{
           return unprocessed.charAt(0) + skipAppNotApple(unprocessed.substring(1));
        }
    }
}