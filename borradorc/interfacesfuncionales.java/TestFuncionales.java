import java.util.List;
import java.util.Random;

import Consumidor;
import interfacesfuncionales.Funcion;
import interfacesfuncionales.FuncionBinaria;
import interfacesfuncionales.Predicado;
import interfacesfuncionales.Proveedor;


public class TestFuncionales {
public static void main(String[] args) {
new TestFuncionales();
}
// Declarativo
public TestFuncionales() {
// a. Crear una lista de enteros.
List<Integer> numbers = SuperFuncion.proveer(20, new AleatorioPositivo());
System.out.println("Nueva Lista -->" + numbers);
// b. Filtrar solo los números pares.
List<Integer> pairs = SuperFuncion.filter(numbers, new PairFilter());
System.out.println("Números pares -->" + pairs);
// c. Filtrar solo los números perfectos.
List<Integer> impairs = SuperFuncion.filter(pairs, new ImpairFilter());
// d. Obtener el cuadrado de cada número.
List<Integer> squareNumbers = SuperFuncion.transform(pairs, new SquareFunction());
System.out.println("Números pares elevados al cuadrado -->" +
squareNumbers);
// e.1 Mostrar cada cuadrado por pantalla retornando lista.
List<Integer> realNumbers = SuperFuncion.perform(squareNumbers, new Impresor());
// e.2 Mostrar cada cuadrado por pantalla no retornando nada.
SuperFuncion.consume(squareNumbers, new Impresor());
// f. Obtener la suma de los cuadrados.
int result = SuperFuncion.reduce(squareNumbers, 0, new SumFunction() );
System.out.println("La suma de los cuadrados -->" + result);
}
}