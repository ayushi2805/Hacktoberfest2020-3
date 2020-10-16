import java.util.Scanner;

class Sort{
    
    public void Mergesort(int[] A){
        int mid = A.length/2;
        if(A.length<2)
            return;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[A.length-mid];
        
        for(int i=0;i<mid;i++){
            arr1[i]=A[i];
        }
        for(int i=mid;i<A.length;i++){
            arr2[i-mid]=A[i];
            
        }

        
        Mergesort(arr1);
        Mergesort(arr2);
        Merge(arr1, arr2,A);
	
    }

    public void Merge(int[] A1,int[] A2, int[]A){
        int i=0,j=0,k=0;;
        while(i<A1.length && j<A2.length){
            if(A1[i]<=A2[j]){
                A[k] = A1[i];
                k++; i++;
            }
            else{
                A[k] = A2[j];
                k++; j++;
            }
        }
        while(i<A1.length){
            A[k] = A1[i];
            k++;  i++;
        }
        while(j<A2.length){
            A[k] = A2[j];
            k++;  j++;
        }
    }
}

class MergeSort{
	public static void main(String args[]){
		Sort s = new Sort();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++){
			A[i] = sc.nextInt();
		}
		s.Mergesort(A);
		System.out.println("Sorted array: ");
		for(int i=0;i<N;i++){
			System.out.println(A[i]);
		}
	}
	}