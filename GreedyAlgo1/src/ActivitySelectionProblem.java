//You are given n activities with their start and finish times.
// Select the maximum number of activities that can be performed by a single person, assuming that a person can only work
// on a single activity at a time.
//Example 2 : Consider the following 6 activities
/*sorted by by finish time.
     start[]  =  {1, 3, 0, 5, 8, 5};
     finish[] =  {2, 4, 6, 7, 9, 9};
A person can perform at most four activities. The
maximum set of activities that can be executed
is {0, 1, 3, 4} [ These are indexes in start[] and
finish[] ]*/


import java.util.Arrays;

public class ActivitySelectionProblem {

    public static void main(String[] args) {
        int start[]  =  {3, 1, 0, 5, 8, 5};
        int finish[] =  {4, 2, 6, 7, 9, 9};
        int length=start.length;
        sortOnFinish(start,finish,length);

        System.out.println(Arrays.toString(start));
        System.out.println(Arrays.toString(finish));
        int maxActivities=maxActivities(start, finish,length);

        System.out.println(maxActivities);
    }

    //sort start[] and finish[] on the basis of finish[]
    private static void sortOnFinish(int[] start, int[] finish,int length) {
        for(int i=1;i<length;i++){
            if(finish[i]<finish[i-1]){
                int tempFinish=finish[i-1];
                int tempStart=start[i-1];
                finish[i-1]=finish[i];
                start[i-1]=start[i];
                finish[i]=tempFinish;
                start[i]=tempStart;

            }
        }
    }

    private static int maxActivities(int[] start, int[] finish, int length) {
        int count=0;
        int i=0;

        for(int j=1;j<length;j++){
            if(start[j]>=finish[i]){ //check if start time of next interval if >=finish time of last interval
                count++;
            }
        }
        return count;
    }
}
