class FactorialLoop {
  public static void main(String[] args) {
    int x=Integer.parseInt(args[0]);
    int product=1;
    for(int i=1; i<=x; i++) {
      product*=i;
    }
    System.out.println(product);
  }
}
