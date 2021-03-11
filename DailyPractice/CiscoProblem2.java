import java.util.*;

public class CiscoProblem2 {



    //	// Use either of these methods for input
    //
    //		//BufferedReader
    //		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //		String name1 = br.readLine();            // Read input from STDIN
    //		System.out.println("Hello " + name1);    // Write output to STDOUT
    //
    //		//Scanner
    //		Scanner s = new Scanner(System.in);
    //		String name2 = s.nextLine();             // Read input from STDIN
    //		System.out.println("Hello " + name2);    // Write output to STDOUT

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Integer totalNumbers = input.nextInt();
        List<Integer> numbers = new ArrayList<>();
        Integer lowest = Integer.MIN_VALUE;
        List<Integer> maxFromLast = new ArrayList<>();


        for (int i = 0; i < totalNumbers; i++) {

            Integer number = input.nextInt();
            numbers.add(number);
            maxFromLast.add(number);

        }
        lowest = maxFromLast.get(totalNumbers - 1);
        for (int i = totalNumbers - 2; i >= 0 ; i--) {
            if (numbers.get(i) > lowest) {
                lowest = numbers.get(i);
                maxFromLast.set(i, lowest);
            } else {
                maxFromLast.set(i, lowest);
            }
        }

        Integer maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < totalNumbers - 1; i++) {
            if (maxFromLast.get(i + 1) > numbers.get(i)) {
                Integer diff = maxFromLast.get(i+1) - numbers.get(i);
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }

        System.out.println(maxDiff);




    }

}
