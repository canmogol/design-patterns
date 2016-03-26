package com.fererlab.pattern.structural.composite;

/**
 * Composite
 */
public class Menu extends Component {

    public Menu(String name, String path) {
        super(name, path);
    }


    public void add(Component component) {
        this.components.add(component);
    }

    public void remove(Component component) {
        this.components.remove(component);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getName()).append(": ").append(getPath()).append("\n");
        for (Component component : components) {
            builder.append(component.toString());
        }
        return builder.toString();
    }
}
