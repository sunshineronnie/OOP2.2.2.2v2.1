public class Car extends Transport {

    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    public void updateTyre() {
        System.out.println("Меняем покрышку car");
    }
    @Override
    public void transportService() {
        updateTyre();
        checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель car");
    }
}

