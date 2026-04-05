
public class PracticeQuestion {
    public static void main(String[] args) {
        subStr("aabbccd", " ");

        System.out.println(subStr2("aabbccd"));

        System.out.println(skipApple("baccdahapplebanc"));

    }

    static void subStr(String unprocessed , String processed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a'){
            subStr(unprocessed.substring(1), processed);
        }else{
            subStr(unprocessed.substring(1),processed + ch);
        }
    }

    static String subStr2(String unprocessed){
        if(unprocessed.isEmpty()){
            return " ";
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a'){
            return subStr2(unprocessed.substring(1));
        }else{
            return ch + subStr2(unprocessed.substring(1));
        }
    }


    static String skipApple(String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }

        if(unprocessed.startsWith("apple")){
            return skipApple(unprocessed.substring(5));
        }else{
            return unprocessed.charAt(0) + skipApple(unprocessed.substring(1));
        }
    }



}