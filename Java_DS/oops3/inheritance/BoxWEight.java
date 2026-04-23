package oops3.inheritance;

public class BoxWEight extends Box{

    double weight;
    
    public BoxWEight(){
        this.weight = -1;
    }

    public BoxWEight(double l , double h , double w , double weight){
        super(l , h, w); //Call the constructor of the parent class
        this.weight = weight;
    }
}
