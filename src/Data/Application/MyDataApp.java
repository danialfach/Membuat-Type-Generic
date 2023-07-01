package Data.Application;

import Data.MyData;

public class MyDataApp {
    public static void main(String[] args) {
        MyData<String> name = new MyData<String>("Dany");
        MyData<Integer> age = new MyData<Integer>(17);
        var Bool = new MyData<Boolean>(true);

        System.out.println(name.getData());
        System.out.println(age.getData());
        System.out.println(Bool.getData());
    }
}
