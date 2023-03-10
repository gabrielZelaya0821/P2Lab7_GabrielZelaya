package modelos;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Carpeta {
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

    public Carpeta(String nombre, String link, ArrayList<Archivo> archivos, ArrayList<Carpeta> carpetas) {
        this.nombre = nombre;
        this.link = link;
        this.archivos = archivos;
        this.carpetas = carpetas;
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
    
}
