public class Main {
    public static void main(String[] args) {
        Car myCar =new Car("VW","Touran","silver",2019);
        myCar.start();

        Car mySecondCar =new Car("VW","T6","Black",2020);
        mySecondCar.start();
        mySecondCar.accelerate(100);

        Person fabian =new Person("Fabian ",34,"male","german");
        Person julia= new Person("Julia ", 36,"female","german");

        fabian.sayHello();
        julia.sayHello();
    }
}
