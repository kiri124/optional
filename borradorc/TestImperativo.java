import java.util.ArrayList;
import java.util.List;

public class TestImperativo<T extends Number> {
    public static void main(String[] args) {
        new TestImperativo<Integer>();
    }

    public TestImperativo() {
       
        List<T> numbers = createList();
    
        
        List<T> pairs = filterPairs(numbers);
        
        
        List<T> perfectNumbers = filterPerfectNumbers(pairs);
        
        
        List<T> squareNumbers = calculateSquareNumbers(pairs);
        
        
        printList(squareNumbers);
     
        double result = sumNumbers(squareNumbers);
        System.out.println("La suma total es: " + result);
    }

  
    private List<T> createList() {
        return List.of(
            (T) Integer.valueOf(6),
            (T) Integer.valueOf(12),
            (T) Integer.valueOf(14),
            (T) Integer.valueOf(22),
            (T) Integer.valueOf(28),
            (T) Integer.valueOf(33),
            (T) Integer.valueOf(14),
            (T) Integer.valueOf(56),
            (T) Integer.valueOf(0),
            (T) Integer.valueOf(23),
            (T) Integer.valueOf(-3),
            (T) Integer.valueOf(46),
            (T) Integer.valueOf(99),
            (T) Integer.valueOf(496),
            (T) Integer.valueOf(1200),
            (T) Integer.valueOf(8128)
        );
    }

   
    private List<T> filterPairs(List<T> numbers) {
        List<T> pairsAux = new ArrayList<>();
        for (T number : numbers) {
            if (number.intValue() % 2 == 0) {
                pairsAux.add(number);
            }
        }
        return pairsAux;
    }


    private List<T> filterPerfectNumbers(List<T> pairs) {
        List<T> perfectsAux = new ArrayList<>();
        for (T number : pairs) {
            if (isPerfectNumber(number.intValue())) {
                perfectsAux.add(number);
            }
        }
        return perfectsAux;
    }

    
    private boolean isPerfectNumber(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n / 2) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
        }
        return sum == n;
    }

   
    private List<T> calculateSquareNumbers(List<T> perfectNumbers) {
        List<T> squaresAux = new ArrayList<>();
        for (T number : perfectNumbers) {
            double square = Math.pow(number.intValue(), 2);
            squaresAux.add((T) Double.valueOf(square));
        }
        return squaresAux;
    }

  
    private void printList(List<T> squareNumbers) {
        for (T number : squareNumbers) {
            System.out.println(number);
        }
    }

   
    private double sumNumbers(List<T> realNumbers) {
        double totalSum = 0;
        for (T number : realNumbers) {
            totalSum += number.doubleValue();
        }
        return totalSum;
    }
}
