package minMaxSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class Result {

    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
        }
        
        for(int i = 0; i < arr.size(); i++){
        long tot = sum - arr.get(i);
        
        if(tot > max) max = tot;
        if(tot < min) min = tot;
        
        }
        System.out.println(min+" "+max);
    }

}


class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
