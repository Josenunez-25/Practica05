/**
 * Interfaz Coleccion
 *
 * Interfaz que define los métodos que debe implementar una colección
 * genérica.
 + @authors José Manuel Núñez Ruíz, Diego Alexander Cisneros Tenorio
 */
public interface Coleccion<T> extends Iterable<T> {
    //metodo insertar
    public void insertar(T elemento);
    //metodo eliminar 
    public void eliminar (int indice);
    //metodo acceder
    public T acceder (int indice);
    //metodo buscar
    public boolean buscar (T elemento);
    //metodo vaciar
    public void vaciar();
}
