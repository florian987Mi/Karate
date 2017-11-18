package org.tutorials.calculation;

import org.apache.log4j.Logger;

public class Main {

  static final Logger logger = Logger.getLogger(Main.class);

  public static void main(String[] args) {

    logger.info("Program started!");
    // TODO Auto-generated method stub

    CalculationResultCollection calColl = new CalculationResultCollection(100, 35);
    calColl.printResult();
  }

}
