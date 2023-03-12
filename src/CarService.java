public class CarService {

    // Починить двигатель заданной машины
    public static void repairEngine(Car car){
        car.getEngine().setDurability(100);
    }

    // Получить самый изношенный двигатель
    public static Engine getMostBroken(Car[] cars){
        int count = 100;
        Engine mostBroken = null;
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].showEngineInfo() <= count){
                count = cars[i].showEngineInfo();
                mostBroken = cars[i].getEngine();
            }
        }
        return mostBroken;
    }
}
