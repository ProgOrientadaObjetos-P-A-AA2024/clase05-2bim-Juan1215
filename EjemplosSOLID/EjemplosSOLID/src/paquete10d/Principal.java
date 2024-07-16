/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete10d;

public class Principal {

    public static void main(String[] args) {

        APIDgo dgo = new APIDgo();
        dgo.establecerApiKey("24685");
        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(dgo);
        gp3.establecerUrl("http://api.movie?api=");
        System.out.println(gp3.obtenerUrl());

        APIDisneyPlus disney = new APIDisneyPlus();
        disney.establecerApiKey("1478963");
        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(disney);
        gp4.establecerUrl("http://api.movie?api=");
        System.out.println(gp4.obtenerUrl());

        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());

        System.out.println("---------------------------");

        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2.obtenerUrl());

    }
}
