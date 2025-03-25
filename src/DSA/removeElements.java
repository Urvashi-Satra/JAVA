package DSA;

public class removeElements {

	 public static int removeElement(int[] nums, int val) {
	        int count=0;
	        int j=0;
	        for(int i=0;i<nums.length-1;i++){
	            if(nums[i] == val){
	                int temp= nums[j];
	                System.out.println(temp);
	           
	                nums[j]=nums[i];
	                nums[i]=temp;
	                j++;
	                count++;
	            }
	        }

	        return nums.length;
	    }
	public static void main(String args[]) {
		int[] nums= {0,1,2,2,3,0,4,2};
		
		System.out.println("op"+removeElement(nums, 2));
		
	}
}
