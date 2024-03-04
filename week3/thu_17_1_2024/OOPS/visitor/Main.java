package visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        List<Element> elements = new ArrayList<>();
        elements.add(new Image("resume.jpeg", 3.7f));
        elements.add(new Paragragh(45, 5, 50));
        elements.add(new Paragragh(18, 3, 21));
        elements.add(new Image("photo.jpeg", 1.0f));
        elements.add(new Image("32400000324.jpeg", 15.7f));
        elements.add(new Paragragh(67, 8, 75));
        elements.add(new Image("signature.jpeg", 1.4f));
        elements.add(new Paragragh(7, 1, 7));
        elements.add(new Image("324243234200.jpeg", 10.7f));
        elements.add(new Paragragh(26, 5, 31));
        elements.add(new Paragragh(45, 5, 50));

        Visitor elmenVisitor = new ElementVisitor();

        for (Element element : elements) {
            element.accept(elmenVisitor);
        }
    }

}

