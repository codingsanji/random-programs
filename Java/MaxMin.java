package Java;

public class MaxMin {
	public int[] roughArr(int[] arr) {
		int n=arr.length;
		int[] rough = new int[n];
		for (int i=0 ; i<n ; i++) {
			rough[i]=arr[i];
		}
		return rough;
	}
	public int[] arrMax(int[] arr) {
	    int[] samplearr = roughArr(arr);
	    int[] answerArr = new int[2];
	    int n = samplearr.length;

	    // Initialize variables to store the indices of largest and second largest elements
	    int maxIndex = 0;
	    int secondMaxIndex = 0; 

	    // Find the index of the largest element
	    for (int i = 1; i < n; i++) {  
	        if (samplearr[i] > samplearr[maxIndex]) {
	            maxIndex = i;
	        }
	    }

	    // Find the index of the second largest element
	    for (int i = 0; i < n; i++) {
	        if (i != maxIndex) {
	            if (secondMaxIndex == 0 || samplearr[i] > samplearr[secondMaxIndex]) {
	                secondMaxIndex = i;
	            }
	        }
	    }

	    // Assign the largest and second largest elements to answerArr
	    answerArr[0] = samplearr[maxIndex];
	    answerArr[1] = samplearr[secondMaxIndex];

	    return answerArr;
	}
	
	public int[] arrMin(int[] arr) {
		int[] samplearr = roughArr(arr);
		int[] answerArr = new int[1];
		int n=samplearr.length;
		for(int i=0 ; i<n ; i++) {
			if (samplearr[0]>samplearr[i]) {
				samplearr[0]=samplearr[i];
			}
		}
		answerArr[0]=samplearr[0];
		return answerArr;
	}

	public void arrDemo() {
		 int[] myArr= {15 , 9 , 3 , 5 , 8 , 2};
		 
		 int[] maxxy= arrMax(myArr);
		 System.out.print("Largest Element: ");
		 System.out.println(maxxy[0]);
		 System.out.print("Second Largest Element: ");
		 System.out.print(maxxy[1]);
		 
		 System.out.println();
		 
		 int[] minny= arrMin(myArr);
		 System.out.print("Smallest Element: ");
		 System.out.print(minny[0]);
	 }
	
	public static void main(String[] args) {
		MaxMin solution=new MaxMin();
		solution.arrDemo();
	}
}
