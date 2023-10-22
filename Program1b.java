class Program1b extends ConsoleProgram {

  /**
  * Description
  * Write a program whose input (via keyboard entry) is a, the length of a side,  
  * and computes and outputs A, the area of a regular octagon. State your answer as an integer.


  * @author:E. Fabroa
  */
  
  public void run() {
    int intSideA;
    int intArea;

    // prompt for side A
    intSideA = readInt("Enter the length of side a: ");

    // calculate  area
    intArea = (int)(2 * (1 + Math.sqrt(2)) * Math.pow(intSideA, 2));

    // output face area
    System.out.println("The area of a regular octagon with side length " + intSideA + " is " + intArea + ".");
   
  }
}
