import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CiscoProblem3 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gridSize = input.nextInt();

        List<String> gridRows = new ArrayList<>();
        //List<String> testData = new ArrayList<>();
        for (int i = 0; i < (gridSize); i++) {
            String newWord = "";
            for (int j = 0; j < gridSize; j++) {
                String line = input.next();
                newWord += line;
            }
            //String line = input.next();
            gridRows.add(newWord);
        }

        int testCases = input.nextInt();
        input.nextLine();
        String testData = input.nextLine();
        
        List<String> allPossibleWords = new ArrayList<>();
        List<String> columnWords = new ArrayList<>();

        for (int i = 0; i < gridSize; i++) {
            String newWord = "";
            for (int j = 0; j < gridSize; j++) {
                gridRows.get(j).charAt(i);
                newWord += gridRows.get(j).charAt(i);
            }
            columnWords.add(newWord);
        }

        for (int i = 0; i < gridSize; i++) {
            allPossibleWords.add(gridRows.get(i));
            allPossibleWords.add(columnWords.get(i));
            allPossibleWords.add(new StringBuilder(gridRows.get(i)).reverse().toString());
            allPossibleWords.add(new StringBuilder(columnWords.get(i)).reverse().toString());
        }


        String[] allTestData = testData.split(" ");

        for (int i = 0; i < allTestData.length; i++) {
            Boolean value = false;
            for (int j = 0; j < allPossibleWords.size(); j++) {
                if (allPossibleWords.get(j).indexOf(allTestData[i]) != -1) {
                    value = true;
                }
            }
            if (value) {
                System.out.print("Yes ");
            } else {
                System.out.print("No ");
            }
        }

        //System.out.println(allPossibleWords);
        //System.out.println(testData);
    }

}
