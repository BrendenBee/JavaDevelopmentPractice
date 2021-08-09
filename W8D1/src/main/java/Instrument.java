public abstract class Instrument {

    private String name;
    private String type;

    public Instrument(String name, String type) {
    }

    //abstract needs to be overwritten at some point by subclasses
public abstract void createSound();

//this is a concrete method, optionally overwritten

public void doThing() {

    System.out.println("This instrument did a thing!");
}

}
