public class Taco implements Eatable{

    @Override
    public void getsAte() {
        System.out.println("The taco was eaten");
    }

    public void setUpCondiments(String condiments) {

        System.out.println("Added to my taco: "+ condiments);
    }










}
