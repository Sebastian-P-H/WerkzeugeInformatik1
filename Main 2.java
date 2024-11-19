public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Car car1 = car2;
        Car car2 = new Car("red", "Tesla", 3);
        Car car3 = car2;

        Car car4 = new Car("yellow", "VW", 4);
Car car2= no Car;
        //An dieser Stelle befindet sich nun ein Array
        //Dieses Array wird mit einem Sortieralgorithmus sortiert
        //Optimaler Code Yippie

        factory.buildCar(car1);
        factory.buildCar(car3);

    }
}

