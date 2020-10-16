import java.util.Scanner;

class SelectionSort{

	public  static void swap(int[]A, int index1, int index2){
		
	}	
		
	public static void main(String args[]){
		// take input from user
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++){
			A[i] = sc.nextInt();
		}
		sc.close();
		
		// sort array using selection sort
		
		for(int i=0;i<N-1;i++){
			int min = A[i];
			int index = i;
			for(int j=i+1;j<N;j++){
				if(A[j]<min){
					min = A[j];
					index = j;
				}
			}
			int temp = A[i];
			A[i] = A[index];
			A[index] = temp;
		}
		
		// output sorted  array
		for(int k=0;k<N;k++){
			System.out.println(A[k]+" ");
		}
	}
}
			