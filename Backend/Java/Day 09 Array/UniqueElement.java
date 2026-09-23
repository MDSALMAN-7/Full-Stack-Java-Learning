/* find UniqueElement
arr = {2,2,4,1,4,5,4,5}; */

class UniqueElement
{
	public static void main(String[] args){
		int[] arr = {2,2,4,1,4,5,4,5};
		
		for(int i = 0; i<arr.length; i++){
			int count = 0;
			for(int j=0; j<arr.length; j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count <2){
				System.out.println("Unique Element "+arr[i]);
			}
		}
	}
}

