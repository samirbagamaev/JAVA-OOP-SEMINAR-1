package WORK;

import WORK.Units.Crossbowman;
import WORK.Units.Monk;
import WORK.Units.Peasant;
import WORK.Units.Sniper;
import WORK.Units.Spearman;
import WORK.Units.Thief;
import WORK.Units.Wizard;

public class game {
    public static void main(String[] args) {
        Peasant peasant = new Peasant("Петя");
        Thief thief = new Thief("Толя");
        Sniper sniper = new Sniper("Сеня");
        Spearman spearman = new Spearman("Саня");
        Crossbowman crossbowman = new Crossbowman("Коля");
        Monk monk = new Monk("Миша");
        Wizard wizard = new Wizard("Вася");
        System.out.println(peasant);
        System.out.println(thief);
        System.out.println(sniper);
        System.out.println(spearman);
        System.out.println(crossbowman);
        System.out.println(monk);
        System.out.println(wizard);
    }
}