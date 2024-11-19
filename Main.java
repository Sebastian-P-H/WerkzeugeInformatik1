public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();

       Car car1 = new Car("blue", "BMW", 5);
        Car car2 = new Car("red", "Audi", 3);
        Car car3 = new Car("green", "VW", 3);
        Car car4 = new Car("blue", "Hyundai", 5);
        Car car5 = new Car("purple", "Audi", 3);
        Car car6 = new Car("pink", "Suzuki", 3);


        Car car7 = new Car("yellow", "Renault", 4);

        //An dieser Stelle befindet sich nun ein Array
        //Dieses Array wird mit einem Sortieralgorithmus sortiert
        //Optimaler Code Yippie

        factory.buildCar(car1);
        factory.buildCar(car2);

    }
}

