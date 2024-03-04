package dynamicUI;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class TestDynamicUI {

    public static void main(String[] args) {
        // Example usage of the dynamic GUI framework
        UIForm form = new UIForm();

        UIElement labelElement = new UIElement("UILabel", "Dynamic Label");
        UIElement buttonElement = new UIElement("UIButton", "Click me!");

        form.addUIElement(labelElement);
        form.addUIElement(buttonElement);
    }
}
