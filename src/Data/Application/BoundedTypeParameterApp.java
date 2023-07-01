package Data.Application;

public class BoundedTypeParameterApp {
    public static void main(String[] args) {
        numberData<Integer> intData = new numberData<>(100);

    }

    public static class numberData<T extends Number>{
        private T data;

        public numberData(T data){
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
