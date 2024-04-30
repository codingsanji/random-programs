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
		int[] answerArr = new int[1];
		int n=samplearr.length;
		for(int i=0 ; i<n ; i++) {
			if (samplearr[0]>samplearr[i]) {
				samplearr[i]=0;
			}
			else {
				samplearr[0]=samplearr[i];
				samplearr[i]=0;
			}
		}
		answerArr[0]=samplearr[0];
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
		 int[] myArr= {5 , 9 , 3 , 15 , 8 , 2};
		 
		 int[] maxxy= arrMax(myArr);
		 System.out.print("Largest Element: ");
		 System.out.print(maxxy[0]);
		 
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
