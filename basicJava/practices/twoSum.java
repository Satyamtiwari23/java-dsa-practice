package Leetcode;
import java.util.Scanner;
public class twoSum {
    public static int[] sumOfIndex(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();   
        int num[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element "+(i+1)+": ");
            num[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int result[] = sumOfIndex(num, target);
        if(result[0] != -1){
            System.out.println("Indices of the two numbers are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }
        sc.close();
    }
}