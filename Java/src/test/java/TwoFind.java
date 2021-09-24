/**
 * @author Aduner
 */
public class TwoFind {
	public int getPos(int[] A, int n, int val) {
		return find(A,0,n-1,val);

	}
	private int find(int[] A,int left,int right,int v){
		if(left>right) return -1;
		int index=(left+right)/2;
		if(A[index]==v){
			return index;
		}else{
			return A[index]<v?find(A,index+1,right,v):find(A,left,index-1,v);
		}
	}

	public static void main(String[] args) {
		System.out.println(new TwoFind().getPos(new int[]{1, 3, 5, 7, 9}, 5, 7));
	}
}
