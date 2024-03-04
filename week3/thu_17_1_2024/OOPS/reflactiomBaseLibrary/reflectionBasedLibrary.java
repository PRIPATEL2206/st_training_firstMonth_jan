package reflactiomBaseLibrary;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 2L; 
    private String name;
    private transient int age; 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(age); 
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        if (serialVersionUID >= 2L) {
            age = ois.readInt(); 
        }
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class reflectionBasedLibrary {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);

     
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Person deserializedPerson = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))) {
            deserializedPerson = (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (deserializedPerson != null) {
            System.out.println("Deserialized Person: " + deserializedPerson);
        }
    }
}
