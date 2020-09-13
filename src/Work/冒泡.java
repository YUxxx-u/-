package Work;

public class ц╟ещ {
	public static void main(String [] args) {
	       int[] num = {0,5,9,7,2,1,-1};
	       paixu(num);
		}
		public static void paixu(int[] num) {
			for(int i = 0;i<num.length-1;i++) {
		    	   for(int j = 0;j<num.length-i-1;j++) {
		    		   if(num[j] > num[j+1]) {
		    			   int temp = num[j];
		    			   num[j] = num[j+1];
		    			   num[j+1] = temp;
		    		   }
		    	   }
		    	
		    	}
		      for(int i = 0;i<num.length;i++) {
		    		System.out.println(num[i]);
		       }
		}
}
