package org.tutorials.calculation;

import org.apache.log4j.Logger;

public class CalculationResultCollection {

  private Integer number1;
  private Integer number2;
  private double resultMultiplication;
  private double resultAddition;
  private double resultSubstraction;
  static final Logger logger = Logger.getLogger(Main.class);

  public CalculationResultCollection(int number1, int number2) {
    super();
    this.number1 = number1;
    this.number2 = number2;

    this.addition();
    this.substraction();
    this.multiplication();
  }

  public double getResultMultiplication() {
    return resultMultiplication;
  }

  public void setResultMultiplication(double resultMultiplication) {
    this.resultMultiplication = resultMultiplication;
  }

  public double getResultAddition() {
    return resultAddition;
  }

  public void setResultAddition(double resultAddition) {
    this.resultAddition = resultAddition;
  }

  public double getResultSubstraction() {
    return resultSubstraction;
  }

  public void setResultSubstraction(double resultSubstraction) {
    this.resultSubstraction = resultSubstraction;
  }


  private void addition() {
    this.resultAddition = this.number1.doubleValue() + this.number2.doubleValue();
  }

  private void substraction() {
    this.resultSubstraction = this.number1.doubleValue() - this.number2.doubleValue();
  }

  private void multiplication() {
    this.resultMultiplication = this.number1.doubleValue() * this.number2.doubleValue();
  }


  public void printResult(){
    logger.info("Number 1: "+this.number1.toString()+" - Number 2: "+this.number2.toString());
    logger.info("Addition result: "+this.getResultAddition());
    logger.info("Substraction result: "+this.getResultSubstraction());
    logger.info("Multiplication result: "+this.getResultMultiplication());
  }

}
