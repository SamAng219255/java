class SumObject{
  public int sumMethod(int v) {
    if(v<2) {
      return 1;
    }
    else {
      return (v+sumMethod(v-1));
    }
  }
}
class Summation {
  public static void main(String args[]) {
    int sumvalue=0;
    int n=10;
    SumObject s = new SumObject();
    sumvalue=s.sumMethod(n);
    System.out.println(sumvalue);
  }
}
