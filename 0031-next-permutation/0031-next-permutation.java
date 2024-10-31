class Solution {
    public void nextPermutation(int[] nums) {
        // Traverse form the end and find the element which is smaller 
        // than its next element. Keep that index as ind

        // Traverse the array from the back and find the element which is
        // nearest element grater that the element present in index ind.
        // Swap them.

        // Reverse the array after the index the index ind

        int ind = -1;

        int n = nums.length;

        for(int i = n - 1; i >= 1; i--) {
            if(nums[i] > nums[i - 1]) {
                ind = i - 1;
                break;
            }
        }

        if(ind == -1) {
            int i = 0, j = n - 1;

            while(i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            }

            return;
        }
        else {
            for(int i = n - 1; i > ind; i--) {
                if(nums[i] > nums[ind]) {
                    int temp = nums[ind];
                    nums[ind] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
        }

        int i = ind + 1, j = n - 1;

        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }

        return;
    }
}