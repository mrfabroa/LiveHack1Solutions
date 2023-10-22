class Program2b extends ConsoleProgram {

  /**
  * Description
  * Write a program that simulates this machine by getting the amount of quarters, 
  * dimes, and nickels provided by the customer and then outputs the number bills/coins 
  * from each denomination to give back, with the goal of giving back the minimum amount 
  * of bills/change (i.e it would back one $20 bill instead of two $10 bills).

  * @author: E. Fabroa
  */
  
  public void run() {
    // declare variables
    int intQuarters;
    int intDimes;
    int intNickles;
    
    double dblTwenties;
    double dblTens;
    double dblFives;
    double dblToonies;
    double dblLoonies;
  

    int intTwenties;
    int intTens;
    int intFives;
    int intToonies;
    int intLoonies;

    double dblCollected;
    double dblTotalDispensed;
    double dblRemaining;

    System.out.println("***** Change-to-Cash *****");

    // Get change
    intQuarters = readInt("Enter the number of quarters: ");
    intDimes = readInt("Enter the number of dimes: ");
    intNickles = readInt("Enter the number of nickles: ");

    // Total amount of money
    dblCollected = (intQuarters * 0.25) + (intDimes * 0.10) + (intNickles * 0.05);
    dblTotalDispensed = (int)(dblCollected);

    System.out.println(" ");
    System.out.println("Total Collected: " + "$" + dblCollected);
    System.out.println("Total Dispensed: " + "$" + dblTotalDispensed);

    // Calculate bills
    intTwenties = (int)(dblTotalDispensed / 20);
    dblRemaining = dblTotalDispensed % 20;

    intTens = (int)(dblRemaining / 10);
    dblRemaining = dblRemaining % 10;

    intFives = (int)(dblRemaining / 5);
    dblRemaining = dblRemaining % 5;

    intToonies = (int)(dblRemaining / 2);
    dblRemaining = dblRemaining % 2;

    intLoonies = (int)(dblRemaining);
    
    // Output
    System.out.println(intTwenties + " x $20");
    System.out.println(intTens + " x $10");
    System.out.println(intFives + " x $5");
    System.out.println(intToonies + " x $2");
    System.out.println(intLoonies + " x $1");
  }
}
