package openclose;

import java.util.ArrayList;
import java.util.List;

public class ChiranjeevisLister {
    public static void main(String[] args) {
        Hanuman hanuman = new Hanuman();
        Vibhishan vibhishan = new Vibhishan();
        Mahabali mahabali = new Mahabali();
        Vyasa vyasa = new Vyasa();

        List<Chiranjeevi> immortals = new ArrayList<>();
        immortals.add(hanuman);immortals.add(vibhishan);immortals.add(mahabali);immortals.add(vyasa);
        list(immortals);
    }

    public static void list(List<Chiranjeevi> immortals) {
        for (Chiranjeevi im : immortals) {
            im.printName();
        }
    }
}
