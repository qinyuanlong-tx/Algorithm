

public class Ag001InsertSort {

	private static int[] unsortArray = {1,4,3,6,99,2,5,13,88};

	public static void main(String[] args){

		for(int i = 1 ; i < unsortArray.length ; i++){
			for(int j = 0 ; j < i ; j++){
				if(unsortArray[j] > unsortArray[i]){
					int temp = unsortArray[i];
					unsortArray[i] = unsortArray[j];
					unsortArray[j] = temp;
				}
			}
		}

		for(int n : unsortArray){
			System.out.print(n + " ");
		}
		System.out.println("");

	}

}

