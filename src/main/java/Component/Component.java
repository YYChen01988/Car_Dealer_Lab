package Component;

public abstract class Component {
    private Engine engine;
    private  Tyre tyre;

    public Component(Engine engine, Tyre tyre) {
        this.engine = engine;
        this.tyre = tyre;
    }

    public Engine getEngine() {
        return engine;
    }


    public void setNewEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setNewTyre(Tyre tyre) {
        this.tyre = tyre;
    }


}
