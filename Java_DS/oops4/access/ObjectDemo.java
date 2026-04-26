package oops4.access;

public class ObjectDemo {

    int num;
    float val;

    public ObjectDemo(int num, float val){
        this.num = num;
        this.val = val;
    }
    
    @Override
    public int hashCode(){          // Num rep of an Obj
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
    }


    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(34, 4.5f);
        ObjectDemo obj2 = new ObjectDemo(34, 6.5f);

        if(obj1 == obj2){
            System.out.println("obj1 is equal to obj 2..");
        }


        if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj 2..");
        }
        // System.out.println(obj.hashCode());
    }
    
}
