import aggregation.*;
import composition.NetflixMovieLibrary;

import java.util.List;

public class Main {

public static void main(String[] args){


Guitar guitar = new Guitar("Zoozly", "Electric");

System.out.println(guitar);
guitar.createSound();

Instrument otherGuitar = new Guitar("Type 2", "Acoustic");

//Below cant be done because strum is with guitar and otherGuitar is with Instrument
    //Also an example of polymorphism
//otherGuitar.strum();

//    Programmer programmer = new Programmer("Jimbo", address);

    NetflixMovieLibrary netflixMovieLibrary = new NetflixMovieLibrary(List.of(movie));

    }

}


