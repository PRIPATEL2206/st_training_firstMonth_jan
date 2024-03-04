package OopsConcepts.Basic;

public class P2 {
    public static void main(String[] args) {
        
        Person p1 = new Person("suresh", 20);
        p1.displayDetails();
    }
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