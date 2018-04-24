import java.util.*;
class RandomDouble {
	public static void main (String args[])throws InterruptedException{
		long[] whens=new long[10];
		boolean[] seenit={false,false,false,false,false,false,false,false,false,false};
		double value=0;
		int i;
		int max=10;
		int count;
		int maxcount=0;
		double firstmin=53;
		double min=53;
		long j=0;
		while(maxcount<9) {
			//System.out.println("8 8 8 8 8 8 8 8 8 8 8 8 8");
			count=0;
			for(i=0; i<max; i++) {
				value=Math.random()*52;
				if(i==0) firstmin=value;
				if(value>firstmin && value>min) count++;
				min=value;
				//System.out.println("\t "+value);
			}
			j++;
			if(count>maxcount) maxcount=count;
			if(!seenit[count]) {
				seenit[count]=true;
				whens[count]=j;
			}
			System.out.println("iteration = "+j+"     count = "+count+"    max = "+maxcount);
		}
		System.out.println(whens[0]+","+whens[1]+","+whens[2]+","+whens[3]+","+whens[4]+","+whens[5]+","+whens[6]+","+whens[7]+","+whens[8]+","+whens[9]);
	}
}
