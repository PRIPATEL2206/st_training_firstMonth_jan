package OopsConcepts.Basic;

public class P4 {
    public static void main(String[] args) {
        Car c1=new Car("f34",2017);
        c1.displayDetails();
    }
}
class Car{
    String model="";
    int year=0;
    Car(String model,int year){
        this.model=model;
        this.year=year;
    }

    void displayDetails(){
        System.out.println("Model: "+model);
        System.out.println("year: "+year);
    }
}