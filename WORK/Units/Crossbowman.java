package WORK.Units;
public class Crossbowman extends Shooter{
    public Crossbowman(String name) {
        super(name, 20, 0.5f, 2, 2, 2, 50, 0.5f, 10);
    }

    @Override
    public String toString() {
        return name;
    }

}
