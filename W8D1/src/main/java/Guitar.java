public class Guitar extends Instrument{

    public Guitar(String name, String type){
        super(name,type);

    }

    @Override
    public void createSound() {

    }

    public void strum(){
        System.out.println("Strumming guitar...");
    }
}
