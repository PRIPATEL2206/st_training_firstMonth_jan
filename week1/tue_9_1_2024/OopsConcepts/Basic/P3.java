package OopsConcepts.Basic;
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