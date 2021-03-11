import java.util.*;

public class CiscoProblem1 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        Integer totalNumbers = input.nextInt();
        List<Integer> numbers = new ArrayList<>();
        Map<Integer, Integer> numberMap = new HashMap<>();
        Integer mode = Integer.MAX_VALUE;
        Integer minFrequency = 1;

        Double sum = 0.0000;
        for (int i = 0; i < totalNumbers; i++) {

            Integer number = input.nextInt();
            //numbers.add(number);
            sum += number;

            if (numberMap.get(number) != null) {
                Integer currentCount = numberMap.get(number);
                numberMap.put(number, currentCount + 1);

                if ((currentCount + 1) > minFrequency) {
                    minFrequency = currentCount+1;
                    mode = number;
                } else if((currentCount+1) == minFrequency) {
                    if (mode > number) {
                        mode = number;
                    }
                }
            } else {
                numberMap.put(number, 1);
                if (minFrequency == 1 && number < mode) {
                    mode = number;
                }
            }
        }

        System.out.print(String.format("%.4f", sum/totalNumbers) + " " + mode);



    }

}
