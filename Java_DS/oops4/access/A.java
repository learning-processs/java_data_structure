package oops4.access;

public class A {
    protected int num;     // Data member
    String name ;
    int [] arr;

    public int getNum(){
        return num;
    }

    public int setterNum(){
        return num;
    }

    public A(int num ,String name ){
        this.num = num;
        this.name = name;
        this.arr = new int [num];
    }
}
