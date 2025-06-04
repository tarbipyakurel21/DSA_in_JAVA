public class BinarySearch {

public static int binarySearch(int [] nums,int target){

int start=0;
int end=nums.length-1;
int steps=0;
while(start<=end){
    steps++;
    int mid=(start+end)/2;
    if (nums[mid]==target){
    System.out.println("steps taken by binary:"+steps);
    return mid;
    }
    else if(nums[mid]<target){
        System.out.println("steps taken by binary:"+steps);
        start=mid+1;
    }
    else if(nums[mid]>target){
        System.out.println("steps taken by binary:"+steps);
        end=mid-1;
    }
}
return -1;
}
}
