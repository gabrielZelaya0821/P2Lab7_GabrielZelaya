package modelos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Carpeta implements Serializable{
    private String nombre;
    private String link;
    private ArrayList<Archivo> archivos;
    private ArrayList<Carpeta> carpetas;

    public Carpeta(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
        this.archivos = new ArrayList<>();
        this.carpetas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }

    public ArrayList<Carpeta> getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(ArrayList<Carpeta> carpetas) {
        this.carpetas = carpetas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
