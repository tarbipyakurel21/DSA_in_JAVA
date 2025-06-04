public class BinarySearchRecursion{

public int binaryRecursion(int [] nums, int target , int start, int end){

    if(start<=end){

        int mid=(start+end)/2;

        if(nums[mid]==target){
            return mid;
        }

        else if(nums[mid]<target){
            return binaryRecursion(nums, target, mid+1, end);

        }
        else if(nums[mid]>target){
            return binaryRecursion(nums, target, start, mid-1);
        }
    }

    return -1;



}



}