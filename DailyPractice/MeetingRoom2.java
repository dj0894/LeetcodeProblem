import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MeetingRoom2 {
    public static void main(String[] args) {

        int[][] intervals=new int[][]{
                        {0,30},
                        {5,10},
                        {15,20},
                        {20,30}

                };
        Queue<Integer> meetingRoom=new PriorityQueue<>(intervals.length, new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                return a-b;
            }
        });

        Arrays.sort(intervals,Comparator.comparing(o->o[0])); //with java 8

        meetingRoom.add(intervals[0][1]);

        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]>=meetingRoom.peek()){
                meetingRoom.poll();
            }

            meetingRoom.add(intervals[i][1]);
        }


        System.out.println(meetingRoom.size());
    }
}

