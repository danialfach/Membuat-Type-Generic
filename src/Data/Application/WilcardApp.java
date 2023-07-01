package Data.Application;

import Data.MyData;

public class WilcardApp {
    public static void main(String[] args) {
        printLength(new MyData<>(100));
        printLength(new MyData<>("Dany"));
        printLength(new MyData<>(true));
    }

    public static void printLength(MyData<?> data) {
        System.out.println(data.getData());
    }
}
