class Program2a extends ConsoleProgram {

  /**
  * Description Write a program that simulates this machine by getting the amount 
  * of $2 coins, $1 coins, quarters, dimes, and nickels provided by the customer 
  * and then outputs the number bills from each denomination to give back,
  *  with the goal of giving back the minimum amount of bills/change 
  * (i.e it would back one $20 bill instead of two $10 bills).

  * @author:E.Fabroa
  */
  
  // 
  public void run() {
    // declare variables
    int intTwoDollars;
    int intOneDollar;
    int intQuarters;
    int intDimes;
    int intNickels;

    double dblTotal;
    int intTotalDispensed;
    int intRemaining;
    int intTwenty;
    int intTen;
    int intFive;

    // output program name
    System.out.println("*** Cash Dispenser *** ");

    // prompt for $2 coins
    intTwoDollars = readInt("Enter the number of $2 coins: ");
    intOneDollar = readInt("Enter the number of $1 coins: ");
    intQuarters = readInt("Enter the number of quarters: ");
    intDimes = readInt("Enter the number of dimes: ");
    intNickels = readInt("Enter the number of nickels: ");

    // calculate and output total
    dblTotal = (intTwoDollars * 2) + (intOneDollar * 1) + (intQuarters * 0.25) + (intDimes * 0.10) + (intNickels * 0.05);
    intTotalDispensed = (int)(dblTotal - (dblTotal % 5));
    System.out.println("Total Collected: $" + dblTotal);
    
    //output total dispensed
    System.out.println("Total dispensed: $" + intTotalDispensed);
    System.out.println("");

    // calculate and output bills
    intTwenty = intTotalDispensed / 20;
    intRemaining = intTotalDispensed % 20;
    intTen = intRemaining / 10;
    intRemaining = intRemaining % 10;
    intFive = intRemaining / 5;
    intRemaining = intRemaining % 5;

    System.out.println(intTwenty + "x $20");
    System.out.println(intTen + "x $10");
    System.out.println(intFive + "x $5");
  }
}
