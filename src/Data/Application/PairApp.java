package Data.Application;

import Data.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Dany",17);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
