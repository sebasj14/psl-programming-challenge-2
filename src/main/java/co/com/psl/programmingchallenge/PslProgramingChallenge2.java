package co.com.psl.programmingchallenge;

public class PslProgramingChallenge2 {
  public static void main(String[] args) {
    double[] preciosAccion = {1100, 1500, 1200, 1300, 1700, 1600, 1400, 1500};
    double[] preciosAccion1 = {2000, 1800, 1600, 1500, 1400, 1200};

    System.out.println(calculateProfitability(preciosAccion));
    System.out.println(calculateProfitability(preciosAccion1));
  }

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
