package _09OOPs.OOP3.Inheritance._01Single_MultiLevel;

// There is single and multilevel inheritance.

public class Box {
    double h;
    double w;
    double l;
    Box(){
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }
    // this is for a cube.
    Box(double value){
        this.h = value;
        this.w = value;
        this.l = value;
    }
    Box(double h, double w, double l){
        this.h = h;
        this.w = w;
        this.l = l;
    }
    Box(Box other){
        this.h = other.h;
        this.w = other.w;
        this.l = other.l;
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        super();
        this.weight = -1;
    }

    BoxWeight(double h, double w, double l, double weight){
        super(h, w, l);     // here we are calling parent class constructor, which requires 3 parameters.
        this.weight = weight;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
}
class BoxPrice extends BoxWeight{
    double price;
    BoxPrice(){
        super();
        this.price = -1;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.price = other.price;
    }
    BoxPrice(double h, double w, double l, double weight, double price){
        super(h, w, l, weight);
        this.price = price;
    }
}
