public class Car {

    private String model;

    private Engine engine;


    // Constructors

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car() {
    }


    // Methods

    // Снимать 10% прочности двигателя за каждые 1000км (distance)
    public void startMove(int distance) {
        if (distance >= 1000) {
            int count = distance / 1000 * 10;
            if (count >= 100 || engine.getDurability() - count < 0) {
                engine.setDurability(0);
                System.out.println("Engine is broken");
            } else engine.setDurability(engine.getDurability() - count);
        }
    }

    // Получить текущую прочность двигателя
    public int showEngineInfo() {
        return engine.getDurability();
    }


    // Get / Set

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
