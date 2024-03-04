package OopsConcepts.Basic;

public class P1 {
    
}

class Person{
String name="";
int age=0;
Person(String name,int age){
    this.name=name;
    this.age=age;
}
void displayDetails(){
    System.out.println(name);
    System.out.println(age);
}
}