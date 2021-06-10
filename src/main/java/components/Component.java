package components;

public class Component {
    protected boolean emitsHeat;

    protected boolean absorbsHeat;

    protected String name;

    protected PowerType powerType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PowerType getPowerType() {
        return powerType;
    }

    public void setPowerType(PowerType powerType) {
        this.powerType = powerType;
    }

    public Component(String name, PowerType powerType, boolean emitsHeat, boolean absorbsHeat) {
        this.name = name;
        this.powerType = powerType;
        this.emitsHeat = emitsHeat;
        this.absorbsHeat = absorbsHeat;
    }
}
