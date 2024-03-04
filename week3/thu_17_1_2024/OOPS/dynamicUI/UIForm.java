package dynamicUI;

import javax.swing.*;

// Simple UIForm class representing a dynamic UI form
class UIForm extends JFrame {
    private final JPanel panel;

    public UIForm() {
        this.panel = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        add(panel);
        setVisible(true);
    }

    // Add UI elements to the form
    public void addUIElement(UIElement uiElement) {
        panel.add(uiElement.createComponent());
        panel.revalidate();
        panel.repaint();
    }
}
