package WORK.Units;
public class Spearman extends Unit {
    public Spearman(String name){
        super(name, 30, 0.6f, 2, 4, 30);
    }

    @Override
    public String toString() {
        return name;
    }

}
