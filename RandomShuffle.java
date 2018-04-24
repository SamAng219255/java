import java.util.*;

class RandomShuffle {
	public static int printArray(int rInts[], int max, int iter, int maxiter, int totalmatches, int[] totlInts) {
		int match=0;
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		for(int i=0; i<rInts.length; i++) {
			System.out.print(rInts[i]+" ");
			if((i+1)%13==0) System.out.println();
			if(rInts[i]==i) match++;
		}
		System.out.println("–––––––––––––––––––––––––––––––––––––––");
		System.out.println("Iteration: "+iter+", Matches: "+match+", Max Matches: "+max+", @: "+maxiter+", AVG matches: "+(totalmatches+match)/(iter+1.0));
		System.out.println("–––––––––––––––––––––––––––––––––––––––");
		totlInts[match]++;
		for(int i=0; i<totlInts.length; i++) {
			System.out.printf("%d:%4f ",i,(double)totlInts[i]/(totalmatches+match+1));
			if((i+1)%13==0) System.out.println();
		}
		return match;
	}
	public static int splice(int[] target, int start, int origlen) {
		int len=origlen-1;
		int there=target[start];
		for(int i=start; i<len; i++) {
			target[i]=target[i+1];
		}
		target[len]=there;
		return there;
	}
	public static void shuffle(int[] bseInt, int[] rndInt, int cards) {
		int max=cards;
		for(int i=0; i<cards; i++) {
			rndInt[i]=splice(bseInt,(int)(Math.random()*max),max);
			max--;
		}
	}
	public static void main(String[] args)throws InterruptedException {
		int cards=52;
		int count;
		int maxmatches=0;
		int matches=0;
		int countatmax=0;
		int totalmatches=0;
		int[] baseInts=new int[cards];
		int[] randInts=new int[cards];
		int[] totlInts=new int[cards];
		for(int i=0; i<cards; i++) {
			totlInts[i]=0;
		}
		for(count=0; count<2147483647; count++) {
			for(int i=0; i<cards; i++) {
				baseInts[i]=i;
				randInts[i]=-1;
			}
			shuffle(baseInts,randInts,cards);
			matches=printArray(randInts,maxmatches,count,countatmax,totalmatches,totlInts);
			if(matches>maxmatches) {
				maxmatches=matches;
				countatmax=count;
			}
			totalmatches+=matches;
			if(matches==cards) break;
			Thread.sleep(10);
		}
	}
}
