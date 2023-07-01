package Data.Application;

import Data.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> dataString = new MyData<>("Dany");
        MyData<Object> data = new MyData<>(100);

        System.out.println(dataString.getData());
        System.out.println(data.getData());
    }
}
