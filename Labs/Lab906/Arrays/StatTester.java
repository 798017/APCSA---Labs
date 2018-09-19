
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class StatTester{
    int[] nums = new int[100];
    public void loadArray(){
        for(int i = 0; i < nums.length; i++){ 
            nums[i] = (int)(Math.random()*10 + 1);	                                                                                                                                
        }
    }

    public void printArray(){
        for (int x = 0; x<nums.length; x++){
            System.out.println(nums[x]);

        }
    }

    public int getSum(){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){ 
            sum = sum + nums[i]; 
        }
        System.out.println("Sum = "+sum);
        return sum;
    }

    public double getMean(){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){ 
            sum = sum + nums[i]; 
        }
        int length = nums.length;
        System.out.println("Mean = "+(sum/length));
        return sum;
    }

    public int getMedian(){
        Arrays.sort(nums);
        int medEven = 0;
        int medOdd = 0;
        boolean yesEven = false;
        for (int i = 0; i<nums.length; i++){
            if (nums[i]%2 == 0){
                medEven = (nums[49]);
                yesEven = true;
            }
            else{
                medOdd = ((nums[49]+nums[50])/2);
            }
        }
        if (yesEven = true){
            System.out.println("med = "+medEven);
        }
        else{
            System.out.println("med = "+medOdd);
        }
        return -1;
    }
}

