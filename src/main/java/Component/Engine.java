package Component;

public class Engine {
    private int horsePower;
    private EngineType type;

    public Engine(int horsePower, EngineType type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public EngineType getType() {
        return type;
    }
}
