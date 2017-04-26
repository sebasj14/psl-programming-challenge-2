package co.com.psl.programmingchallenge;

public class PslProgramingChallenge2 {
  public static void main(double[] args) {
    System.out.println(calculateProfitability(args));
  }

  /**
   * Calculates the total profitability of the given array of prices. <br>
   * Prof = sales - purchases. 
   * @param prices
   * @return total profitability.
   */
  public static double calculateProfitability(double[] prices) {
    double profitability = 0;
    for (int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        double actualProf = prices[j] - prices[i];
        if (actualProf > profitability) {
          profitability += actualProf;
        }
      }
    }


    return profitability;
  }
}
