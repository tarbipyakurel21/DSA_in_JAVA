
public class LinearSearch {
    

    // class is also a user-defined data type
    // how will you work with data structures
    // time complexity 
    // space complexity
    // linear search
    // binary search
 public int linearSearch(int [] nums, int target){
    
    for (int i = 0;i<nums.length-1;i++){
    
        if(nums[i]==target){
            return i;
        }
    }
    
    return -1;
    
    }
}
    