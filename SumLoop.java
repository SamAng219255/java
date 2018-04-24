class SumLoop {
  public static void main(String[] args) {
    int x=Integer.parseInt(args[0]);
    int sum=0;
    for(int i=1; i<=x; i++) {
      sum+=i;
    }
    System.out.println(sum);
    System.out.println((Math.pow(x,2)+x)/2);
  }
}
