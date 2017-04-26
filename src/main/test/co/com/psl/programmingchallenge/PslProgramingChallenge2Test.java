package co.com.psl.programmingchallenge;

import org.junit.Assert;
import org.junit.Test;

public class PslProgramingChallenge2Test {

  double[] preciosAccion = {1100, 1500, 1200, 1300, 1700, 1600, 1400, 1500};
  double[] preciosAccion1 = {2000, 1800, 1600, 1500, 1400, 1200};

  @Test
  public void testCalculateProfitabilityEx1() {
    double actualProfitability = PslProgramingChallenge2.calculateProfitability(preciosAccion);
    double expectedProfitability = 1000;
    
    Assert.assertEquals(expectedProfitability, actualProfitability, 0.01);
  }
  
  @Test
  public void testCalculateProfitabilityEx2() {
    double actualProfitability = PslProgramingChallenge2.calculateProfitability(preciosAccion1);
    double expectedProfitability = 0;
    
    Assert.assertEquals(expectedProfitability, actualProfitability, 0.01);
  }
}
