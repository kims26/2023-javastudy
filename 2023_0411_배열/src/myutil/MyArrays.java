package myutil;

public class MyArrays {
	
	//Call By Reference

	public static void display_arrays(int [] mr) {
		

		System.out.print("[");
		for(int i = 0; i<mr.length;i++) {//i =0 1 2...(mr.length -1)
			
			System.out.printf("%3d", mr[i]);
		}
		System.out.println("]");
		

	}
	
	//모든 배열을 val 채우기
	public static void fill(int [] mr,int val) {
		for(int i = 0; i<mr.length;i++) {
			
			//i =0 1 2...(mr.length -1)
		mr[i]=val;
			}
		}
	//배열의 구간별 채우기
	
	public static void fill(int [] mr,
			int fromIndex,
			int toIndex,
			int val) {
		for(int i = fromIndex; i<toIndex;i++) {
			
			//i =0 1 2...(mr.length -1)
		mr[i]=val;
			}
		}
	//배열 순서대로 채우기
	public static void set(int [] mr) {
		for(int i=0; i<mr.length; i++) {// i =0 1 2 ..(mr.length
			mr[i]= i+1;
			
		}
	}
	//배열 오름 차순 정렬(선택정렬 :Selection Sort)
	public static void sort_asc(int [] mr ) {
		
		//i->select(기준)
		for(int i = 0; i<mr.length-1;i++) {
			
		for(int k =i+1; k<mr.length;k++) {
			
			//앞쪽데이터가 크면 교환해라
			if(mr [i]> mr[k]) {
				
				int im =mr[i];
				mr[i]=mr[k];
				mr[k]=im;
				
			}
		}//end-for-k
		
	}//end-for-i
//		public static int sort_desc(int[] mr) {
//			for (int i = 0; i < mr.length / 2; i++) {
//			    int temp = mr[i];
//			    mr[i] = mr[mr.length - 1 - i];
//			    mr[mr.length - 1 - i] = temp;
//			}
//			return mr[0];
//		}
//		
	}

	   
	}

		
	


