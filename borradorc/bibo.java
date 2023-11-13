import java.util.ArrayList;
import java.util.List;

public class bibo {
    public static void main(String[] args) {
        
List<Integer> listaOrigen = new ArrayList<>();
listaOrigen.add(1);
listaOrigen.add(2);
listaOrigen.add(3);
listaOrigen.add(4);

List<Integer> listaDestino= new ArrayList <>();
listaOrigen.forEach(numero -> listaDestino.add(numero));
//listaOrigen.forEach(elemento -> listaDestino.add(elemento));

System.out.println("Lista de destino: "+ listaDestino);
    }
}
