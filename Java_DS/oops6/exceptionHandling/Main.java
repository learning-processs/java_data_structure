package oops6.exceptionHandling;

public class Main {

    public static void main(String args[]){
        int a = 5;
        int b = 0;
        try {
            // int c = a / b;
            // divide(a,b);
            
            String name = "Exception";
            if(name.equals("Exception")){
                throw new MyException("This is Exception..");
            }

        }catch (MyException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
           System.out.println(e.getMessage());
        }finally{
            System.out.println("This will always Execute..."); // No matter what happend always execute
        }
    }

    static int divide(int a , int b) throws ArithmeticException{   // throws-> declarations
        if( b== 0){
            throw new ArithmeticException("Please do not divide by zero..."); // throw arithmeticException
        }
        return a/b;
    }

}
