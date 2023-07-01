package Data.Application;

import Data.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectData = new MyData<>("Dany");
        MyData<? super String> myData = objectData;
        proccess(objectData);
        System.out.println(objectData.getData());
    }

    public static void proccess(MyData<? super String> myData){
        myData.setData("Dany");
    }
}
