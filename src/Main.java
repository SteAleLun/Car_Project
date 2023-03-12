public class Main {
    public static void main(String[] args) {

        ///////////////////// ПРОВЕРКА startMove() И repairEngine() ////////////////////////

        /*
        Car car_1 = new Car("Volkswagen", new Engine());

        car_1.startMove(11000);
        System.out.println("Car_1 engine durability is: " + car_1.showEngineInfo());

        CarService.repairEngine(car_1);
        System.out.println("Repairing...");
        System.out.println("Car_1 engine durability is: " + car_1.showEngineInfo());
        */


        ///////////////////// ПРОВЕРКА getMostBroken() //////////////////////

        Car car_1 = new Car("Volkswagen", new Engine());
        Car car_2 = new Car("Ferrari", new Engine());
        Car car_3 = new Car("Pagani", new Engine());
        Car car_4 = new Car("McLaren", new Engine());
        Car car_5 = new Car("Koenigsegg", new Engine());

        Car[] cars = {car_1, car_2, car_3, car_4, car_5};

        car_1.startMove(1000);
        car_2.startMove(2000);
        car_3.startMove(4000);
        car_4.startMove(8000);
        car_5.startMove(9000);

        System.out.println("Car_1 engine durability is: " + car_1.showEngineInfo());
        System.out.println("Car_2 engine durability is: " + car_2.showEngineInfo());
        System.out.println("Car_3 engine durability is: " + car_3.showEngineInfo());
        System.out.println("Car_4 engine durability is: " + car_4.showEngineInfo());
        System.out.println("Car_5 engine durability is: " + car_5.showEngineInfo());

        System.out.println("The most broken engine has durability: " + CarService.getMostBroken(cars).getDurability());

    }
}
