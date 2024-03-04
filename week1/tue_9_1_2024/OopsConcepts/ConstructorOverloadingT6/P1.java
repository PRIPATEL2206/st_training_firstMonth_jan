package OopsConcepts.ConstructorOverloadingT6;

public class P1 {
    
}

class Person{
    String name;
   int  age;
   float hight;
   float weight;

   Person(){
    name="";
    age=0;
     hight=0;
     weight=0;
   }
   Person(String name,int age){
    this.name=name;
    this.age=age;
     hight=0;
     weight=0;
   }
   Person(String name,int age,float hight,float weight){
    name="";
    this.age=age;
    this.hight=hight;
    this.weight=weight;
   }
}