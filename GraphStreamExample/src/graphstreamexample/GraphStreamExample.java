package graphstreamexample;

//importar las librerías necesarias de graphstream
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
/**
 *
 * @author gmathus & jcfontecha
 */
public class GraphStreamExample {

    
    public static void main(String[] args) {
        
        //Crear el objecto de Graph
        Graph graph = new SingleGraph("Ejemplo 1");
        
        //Añadir nodos
        graph.addNode("A" );
        graph.addNode("B" );
        graph.addNode("C" );
        
        //añadir edges
        graph.addEdge("AB", "A", "B");
        graph.addEdge("BC", "B", "C");
        graph.addEdge("CA", "C", "A");
        
        
        //métodos que demuestran funcionalidad básica
        
        //imprimir todos los nodos
        ImprimirNodos(graph);
        
        //Imprimir los edges (rutas o como sea) del grafo
        ImprimirEdges(graph);
        
        //mostrar grafo
        graph.display();
    }
    private static void ImprimirNodos(Graph g) {
        System.out.println("\nNodos del grafo:");
        
        //este for mágico va a interar sobre cada nodo y, por suerte
        //el objeto Node tiene una implementación de "ToString()" :)
        for(Node n:g.getEachNode()) {
            System.out.println(n.getIndex() + ": " + n.toString());
        }
    }

    private static void ImprimirEdges(Graph g) {
        System.out.println("\nEdges del grafo:");
        
        //este for mágico va a interar sobre cada edge y, por suerte
        //el objeto Edge tiene una implementación de "ToString()" :)
        for(Edge e:g.getEachEdge()) {
            System.out.println(e.getIndex() + ": " + e.toString());
        }
    }
            
    
}
