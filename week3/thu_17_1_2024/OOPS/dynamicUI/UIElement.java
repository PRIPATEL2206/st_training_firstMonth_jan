package dynamicUI;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Simple UIElement class representing a GUI element
class UIElement {
    private final String type;
    private final String text;

    public UIElement(String type, String text) {
        this.type = type;
        this.text = text;
    }

    // Dynamic UI construction using reflection
    public Component createComponent() {
        try {
            // Assuming a convention: UI classes are in the same package
            Class<?> uiClass = Class.forName("your.package." + type);
            Constructor<?> constructor = uiClass.getConstructor(String.class);
            return (Component) constructor.newInstance(text);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException
                 | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            return new JLabel("Error creating UI element");
        }
    }
}
