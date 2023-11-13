package xd;
import java.util.Optional;

//import javax.swing.text.html.Option;

public class str {
    public static void main(String[] args) {
    
System.out.println(result(null,"valor reserva"));
    }

    public static String result(String value, String otherValue)
    {
        return Optional.ofNullable(value)
        .orElseGet(()->otherValue);
        //.orElseGet(()->otherValue);
    }
/*1)
value.ifPresent(System.out::println);
:: este hace referencia a un metodo,
 y re quiere que no sea nulo
//esta y esta:  2) , 
System.out.println(value.get());
//hacen la misma accion 

3) ahora si acepta nulo , pero aqui no podemos usar el 
value.get,  porque saldra : 
NoSuchElementException: No value present

aqui debemos usar el 
value.ifPresent(System.out::println)  , pq esta diciendo si
esta presente el valor ,si no no pasa nada

4)
Optional<String> value = Optional.ofNullable(null);
Runnable emptyAction=()-> System.out.println("el valor es nulo");
value.ifPresentOrElse(System.out::println, emptyAction);

5)
 Optional<String> value= Optional.ofNullable("eduardito");
        var name= value.orElse("unknown");
        System.out.println("nombre del sujetito: "+ name);

        6)   Optional<String> value = Optional.ofNullable("eduardo");
      System.out.println(value.isEmpty()?"Es null": "Aceptamos operacion");


 */


      //  Optional<String> value =Optional.ofNullable(null);
       // System.out.println(value.get());
    }

