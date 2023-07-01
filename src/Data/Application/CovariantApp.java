package Data.Application;

import Data.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> data = new MyData<String>("Dany");
        process(data);
    }

    public static void process(MyData<? extends Object> data){
        Object object = data.getData();
        System.out.println(data.getData());
    }
}
