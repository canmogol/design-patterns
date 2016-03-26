package com.fererlab.pattern.structural.composite;

/**
 * Leaf
 */
public class Item extends Component {

    public Item(String name, String path) {
        super(name, path);
    }

    @Override
    public String toString() {
        return getName() + ": " + getPath() + "\n";
    }

}
