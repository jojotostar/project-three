/*
Henry Do ＆ Shoto Morisaki　＆Riana Ali
May 26th 2021
Project 3
*/

public class Financial {
    /**
      Computes a percentage of an amount.
      @param percentage the percentage to apply
      @param amount the amount to which the percentage is applied
      @return the requested percentage of the amount

      In your bankAccount class you should have a method that calculates interest if the account is a savings account. In this method you will invoke the static method from the Financial class.

      
   */
   public static double percentOf(double percentage, double amount)
   {
      return (percentage / 100) * amount;
   }
}


