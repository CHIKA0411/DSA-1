import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class BreadthFirstSearch<T> {
    private final Vertex<T> startVertex;
    private List<T> Neighbour;

    public BreadthFirstSearch(Vertex<T> startVertex){
        this.startVertex=startVertex;

    }

    public void Traverse(){
        Queue<Vertex<T>> queue =new LinkedList<>();
        queue.add(startVertex);
        while(!queue.isEmpty()){
            Vertex<T> current =queue.poll();
            if(!current.isVisited()) {
                current.setVisited(true);
                System.out.println(current);
                queue.addAll(current.getNeighbours());
            }
        }
    }
    public static void main(String [] args){
        Vertex<Character> v0=new Vertex<>('A');
        Vertex<Character> v1=new Vertex<>('B');
        Vertex<Character> v2=new Vertex<>('C');
        Vertex<Character> v3=new Vertex<>('D');
        Vertex<Character> v4=new Vertex<>('E');
        Vertex<Character> v5=new Vertex<>('F');
        Vertex<Character> v6=new Vertex<>('G');

        v0.setNeighbours(Arrays.asList(v1,v5,v6));
        v1.setNeighbours(Arrays.asList(v3,v4,v5));
        v4.setNeighbours(Arrays.asList(v2,v6));
        v6.setNeighbours(Arrays.asList(v0));
        BreadthFirstSearch<Character> bfs= new BreadthFirstSearch<>(v1);
        bfs.Traverse();

    }


}
