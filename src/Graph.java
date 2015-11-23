
import Semana14.Edge;
import java.util.Iterator;

/** Interface para especificar un TDA Grafo.
 * Un grafo es un grupo de vertices y aristas. Los vértices están representados por enteros desde 0 hasta n-1.
 * Las aristas están ordenadas en pares de vértices. Cada implementación de la interface grafo debe proveer un constructor que  especifique el
 * número de vértices y si un grafo o no es dirigido
 */
public interface Graph {
    //Métodos de acceso
        /**
     * Devuelve el número de vértices
     * @return La cantidad de vértices
     */
    int getNumV();
    
    /**
     * Determina si es un grafo dirigido
     * @return verdadero si este es un grafo dirigido
     */
    boolean isDirected();
    
    /**
     * Determina si una arista existe
     * @param edge la nueva arista
     */
    void insert(Edge edge);

    /**
     * Obtiene la arista entre dos vértices
     * @param source es el vértice origen
    * @param dest es el vértince destino
     * @return verdadero si existe una arista desde un origen
    * a un destino dados
     */
    boolean isEdge (int source, int dest);
    
    /**
    * Obtiene la arista entre dos vértices
    * @param source el vértice origen
    * @param dest el vértice destino
    * @return La arista entre los dos vétices
    */
   Edge getEdge(int source, int dest);

   /**
   * Devuelve un iterador de aristas conectadas a un vértice dado
   * @param source el origen del vértice
   * @return Un iterador<Edge> a los vétices conectados al origen.
   */
   Iterator<Edge> edgeIterator(int source);
}