public class RBIQuestion1DP {


    public static void solve(int sum) {

        Notes[] notes = new Notes[sum];

        notes[20] = new Notes(0,0,1,1);
        notes[40] = new Notes(0,0,2,2);
        notes[50] = new Notes(0,0,1,1);
        notes[60] = new Notes(0,0,1,1);
        notes[70] = new Notes(0,0,1,1);
        notes[80] = new Notes(0,0,1,1);
        notes[90]= new Notes(0,1,0,1);
        notes[100]=new Notes(1,0,0,1);
        notes[110]=new Notes(1,0,0,1);


        for(int i=40;i<=sum;i+=10) {
            int x = i - 20;
            int y = i - 50;
            int z = i - 100;


        }

    }



    public static void main(String[] args) {



    }


    public static final class Notes {
        int hundredCount;
        int fiftyCount;
        int twentyCount;
        int total;

        public Notes(int hundredCount, int fiftyCount, int twentyCount, int total) {
            this.hundredCount = hundredCount;
            this.fiftyCount = fiftyCount;
            this.twentyCount = twentyCount;
            this.total = total;
        }
    }

}
