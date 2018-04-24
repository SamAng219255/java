import java.math.BigInteger;
public class BigLong {
  public static void main(String[] args) {
    long n = Long.valueOf(args[0]);
    System.out.println(n);
    BigInteger factor=new BigInteger("1");
    for(long i=2; i<=n; i++) {
      factor=factor.multiply(BigInteger.valueOf(i));
    }
    System.out.println(factor);
  }
}
