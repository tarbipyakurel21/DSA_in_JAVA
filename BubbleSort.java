public class BubbleSort {
    
    
    public int[] bubbleSort(int []nums){
        int temp;
       int size=nums.length;

    for(int j=0;j<size;j++){
    for (int i=0;i<size-i-1;i++){

        if (nums[i]>nums[i+1]){
            temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
        }

}}

    System.out.println(nums);
    return nums;
    }
}
