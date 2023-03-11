package persistenciaDeDatos;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class ManejoArchivos {

    private File archivo;
    private ArrayList<String> datos;

    //crea un archivo
    public ManejoArchivos(String archivo) {
        this.archivo = new File("./data/"+archivo);
        this.datos = new ArrayList();
    }

    //trabaja con un archivo ya existente
    public ManejoArchivos(File archivo) throws Exception {
        this.archivo = archivo;
        this.datos = new ArrayList();
        obtenerDatos();
    }

    //agrega un objeto al archivo
    public void escribirArchivo(String contenido) {
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido); 
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        datos.add(contenido);
    }
    
    public ArrayList<String> leerArchivo() {
        ArrayList<String> lectura = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String leer = entrada.readLine();
            while (leer != null) {
                lectura.add(leer);
                leer = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return lectura;
    }

    public void eliminarArchivo() throws Exception {
        if (archivo.exists()) {
            archivo.delete();
        }else{
            throw new Exception("No existe el archivo");
        }
    }
    
    public boolean existeDato(String elemento){
        for (String dato : datos) {
            if(dato.equals(elemento)){
                return true;
            }
        }
        
        return false;
    }

    public void obtenerDatos() throws Exception{
        if(archivo.exists()){
            String elemento;

            try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo)) ){
                while(true){
                    elemento = (String) ois.readObject();
                    datos.add(elemento);
                }
            }catch(FileNotFoundException ex){
                System.err.println(ex.getMessage());
            } catch (EOFException ex) {
            } catch (IOException | ClassNotFoundException ex) {
                System.err.println(ex.getMessage());
            }
        }else{
            throw new Exception("No existe el archivo");
        }
    }
    
    //hace una copia y después de borrar el archivo llena de nuevo el archivo
    public void eliminarDato(String dato) throws Exception{
        if(datos.remove(dato)){
            ArrayList<String> copia = datos;
            eliminarArchivo();
            for (String t : copia) {
                escribirArchivo(t);
            }
        }
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<String> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<String> datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return archivo.toString();
    }
    
}