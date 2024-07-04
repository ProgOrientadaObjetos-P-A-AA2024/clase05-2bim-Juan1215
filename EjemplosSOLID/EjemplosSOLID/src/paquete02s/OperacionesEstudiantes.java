/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02s;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;
    // Una Persona, tiene un atributo ciudad de tipo Ciudad
    // Una Ciudad, tiene un atributo nombre de tipo String

    public void establecerEdadminima() {
        edadminima = 100;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).obtenerEdad() < edadminima) {
                edadminima = estudiantes.get(i).obtenerEdad();
            }
        }
    }

    public void establecerEdadmaxima() {
        edadmaxima = -100;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).obtenerEdad() > edadmaxima) {
                edadmaxima = estudiantes.get(i).obtenerEdad();
            }
        }
    }

    public void establecerListaCiudadesEstudiantes() {
        String cadena = "";
        for (int i = 0; i < estudiantes.size(); i++) {
            cadena = String.format("%s%s\n", cadena, 
                    estudiantes.get(i).obtenerCiudad().obtenerNombre());
        }
        listaCiudadesEstudiantes = cadena;
    }
    
    

    public void establecerListaCiudadesEstudiantes(String l) {
        listaCiudadesEstudiantes = l;
    }

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public int obtenerEdadminima() {
        return edadminima;
    }

    public int obtenerEdadmaxima() {
        return edadmaxima;
    }

    public String obtenerListaCiudadesEstudiantes() {
        return listaCiudadesEstudiantes;
    }
  
    public double obtenerPromedioEdades() {

        return promedioEdades;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Promedio de edad: %.2f\n"
                + "Edad minima: %d\n"
                + "Edada maxima: %d\n"
                + "Lista Estudiantes: \n%s\n",
                obtenerPromedioEdades(),
                obtenerEdadminima(),
                obtenerEdadmaxima(),
                obtenerListaCiudadesEstudiantes());
        return cadena;
    } 

}
