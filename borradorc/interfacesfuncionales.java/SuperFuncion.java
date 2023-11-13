
import java.util.ArrayList;
import java.util.List;

public class SuperFuncion {
public static List<Integer> filter(List<Integer> numbers, Predicado predicado) {
List<Integer> auxList = new ArrayList<Integer>();
for (int i = 0; i < numbers.size(); i++) {
if (predicado.test(numbers.get(i))) {
auxList.add(numbers.get(i));
}
}
return auxList;
}
public static List<Integer> proveer(int size, Proveedor proveedor) {
List<Integer> auxList = new ArrayList<Integer>();
for (int i = 0; i < size; i++) {
auxList.add(proveedor.obtener());
}
return auxList;
}
}
