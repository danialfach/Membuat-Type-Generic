package Data.Application;

import Data.Util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Danial","Fachrudin","Ganteng"};
        Integer[] values = {1,2,3,4,5,6};

//        System.out.println(ArrayHelper.<String>count(names)); tidak disarankan
        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(values));
    }
}
