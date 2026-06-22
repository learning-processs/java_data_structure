package Strings;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class RandomStr {

    static String generate(int size){

        StringBuffer sb = new StringBuffer(size);

        Random random = new Random();

        for(int i = 0 ; i < size ; i++){
            int randomChar = 97 + (int)(random.nextFloat() * 26);
            sb.append((char)randomChar);

        }
        return sb.toString();

    }

    public static void main(String[] args) {
        
        Random rand = new Random();
        System.out.println(rand.nextFloat());


        System.out.println((char)(97 + 1));


        int n = 20;
        String name = generate(n);
        System.out.println(name);

        String sentence = "Hi h hjh hjkso   siowi    w";

        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s" , ""));


        // split
        String arr = "Anu Tina Avani";

        String [] names = arr.split(",");
        System.out.println(Arrays.toString(names));

        // rounding off
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(7.25));
    }
}
