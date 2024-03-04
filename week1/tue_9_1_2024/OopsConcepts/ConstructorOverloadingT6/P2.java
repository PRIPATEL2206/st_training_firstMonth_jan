package OopsConcepts.ConstructorOverloadingT6;

public class P2 {
   Person p1=new Person(); 
   Person p2=new Person("suresh",20); 
   Person p3=new Person("mukesh",40,170,80); 
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