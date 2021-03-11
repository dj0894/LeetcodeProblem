public class RBIQuestion1 {

    public static void main(String[] args) {

        int amount = 230;

        int maxHundred = amount/100 + 1;
        int maxFifty = amount/50 + 1;
        int maxTwenty = amount/20 + 1;
        int min = 500;
        int hundredNotes = 500;
        int fiftyNotes = 500;
        int twentyNotes = 500;
        for (int i = 0; i < maxHundred; i++) {
            for (int j = 0; j < maxFifty; j++) {
                for (int k = 0; k < maxTwenty; k++) {
                    int total = i*100 + j*50 + k*20;
                    if (total == amount) {
                        if ((i + j + k) < min) {
                            min = i+j+k;
                            hundredNotes = i;
                            fiftyNotes = j;
                            twentyNotes = k;
                        }
                    }
                }
            }
        }
        System.out.println(hundredNotes);
        System.out.println(fiftyNotes);
        System.out.println(twentyNotes);
        System.out.println(min);
    }





}
