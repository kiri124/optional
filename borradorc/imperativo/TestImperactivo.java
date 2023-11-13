package imperativo;
import java.util.ArrayList;
import java.util.List;
public class TestImperactivo {
public static void main(String[] args) {
new TestImperactivo();
}
public TestImperactivo() {
// a. Crear una lista de enteros.
List<Integer> numbers = createList();
//System.out.println(numbers);
// b. Filtrar solo los números pares.
List<Integer> pairs = filterPairs(numbers);
//System.out.println(pairs);
// c. Filtrar solo los números perfectos.
List<Integer> perfectNumbers = filterPerfectNumbers(pairs);
//System.out.println(perfectNumbers);
// d. Convertir cada número al cuadrado.
List<Integer> squareNumbers = calculateSquareNumbers(pairs);
//System.out.println(squareNumbers);
// e. Mostrar cada cuadrado por pantalla.
List<Integer> realNumbers = printList(squareNumbers);
System.out.println(realNumbers);
// f. Obtener la suma de los cuadrados.
int result = sumIntegers(realNumbers);
System.out.println("La suma total es: " + result);
}
// a. Crear una lista de enteros.
private List<Integer> createList() {
return List.of(6, 12, 14, 22, 28, 33, 14, 56, 0, 23, -3, 46, 99, 496,
1200, 8128);
}
// b. Filtrar solo los números pares.
private List<Integer> filterPairs(List<Integer> numbers) {
List<Integer> pairsAux = new ArrayList<Integer>();
for (Integer number : numbers) {
if (number % 2 == 0) {
pairsAux.add(number);
}
}
return pairsAux;
}
// c. Filtrar solo los números perfectos.
private List<Integer> filterPerfectNumbers(List<Integer> pairs) {
List<Integer> perfectsAux = new ArrayList<Integer>();
for (Integer number : pairs) {
if (perfectNumber(number) == number) {
perfectsAux.add(number);
}
}
return perfectsAux;
}
private int perfectNumber(int n) {
int i = 1;
int sum = 0;
while (i <= n / 2) {
if (n % i == 0) {
sum = sum + i;
}
i++;
}
return sum;
}
// d. Convertir cada número al cuadrado.
private List<Integer> calculateSquareNumbers(List<Integer> perfectNumbers) {
List<Integer> squaresAux = new ArrayList<Integer>();
for (Integer number : perfectNumbers) {
squaresAux.add(number * number);
}
return squaresAux;
}
// e. Imprimir cada cuadrado por pantalla.
private List<Integer> printList(List<Integer> squareNumbers) {
for (Integer number : squareNumbers) {
System.out.println(number);
}
return squareNumbers;
}
// f. Obtener la suma de los cuadrados.
private int sumIntegers(List<Integer> realNumbers) {
int totalSum=0;
for (Integer number : realNumbers) {
totalSum += number;
}
return totalSum;
}








}
