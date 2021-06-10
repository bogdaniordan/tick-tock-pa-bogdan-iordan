package model;

import components.*;

import java.util.ArrayList;
import java.util.List;

public class PC {
//    private final Map<Component, Integer> components;
    private final List<Component> components;

    private boolean isWorking = false;

    public PC() {
        components = new ArrayList<>();
//        components = new HashMap<>();
    }

//    public List<Component> getComponents() {
//        return components;
//    }

    public void addComponent(Component component) {
        if (!containsComponent(component)) {
            components.add(component);
            PCisNowWorking();
        } else {
            throw new IllegalStateException("Cannot add component!");
        }

    }

    private boolean containsComponent(Component newComponent) {
        if (newComponent.getClass() == CPU.class) {
            for (Component component: components) {
                if (component instanceof CPU) {
                    return true;
                }
            }
        } else if (newComponent.getClass() == RAM.class) {
            for (Component component : components) {
                if (component instanceof RAM) {
                    return true;
                }
            }
        } else if (newComponent.getClass() == PowerSupply.class) {
            for (Component component : components) {
                if (component instanceof PowerSupply) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWorking() {
        return isWorking;
    }

    private boolean checkWorkingPC() {
        int posCount = 0;
        for (Component component: components) {
            if (component.getPowerType() == PowerType.POSITIVE) {
                posCount++;
            }
        }
        return posCount >= getPowerCountCriteria();
    }

    private void PCisNowWorking() {
        if (checkWorkingPC()) {
            isWorking = true;
        }
    }


    private int getPowerCountCriteria() {
        return components.size() / 2 + 1;
    }
}
