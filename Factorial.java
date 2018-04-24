import java.math.BigInteger;
class FactObject{
  public BigInteger factMethod(BigInteger v) {
    if(v.compareTo(new BigInteger("2"))<0) {
      return new BigInteger("1");
    }
    else {
      return v.multiply(factMethod(v.subtract(BigInteger.valueOf(1))));
    }
  }
}
class Factorial {
  public static void main(String args[]) {
    BigInteger factvalue=new BigInteger("0");
    FactObject s = new FactObject();
    factvalue=s.factMethod(new BigInteger(args[0]));
    System.out.println(factvalue);
  }
}
