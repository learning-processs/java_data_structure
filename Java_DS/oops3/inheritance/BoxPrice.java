package oops3.inheritance;

public class BoxPrice extends BoxWEight{
    double cost ;

    BoxPrice(){
        super();
        this.cost = -1;
    }


     BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

}
