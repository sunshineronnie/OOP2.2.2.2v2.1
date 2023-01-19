public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку truck");
    }

    @Override
    public void transportService() {
        updateTyre();
        checkEngine();
        checkTrailer();

    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель truck");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп truck");
    }
}
