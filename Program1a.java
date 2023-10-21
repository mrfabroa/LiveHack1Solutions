class Program1a extends ConsoleProgram {

  /**
  * Description
  * Write a program whose input (via keyboard entry) is a, the length of a side,  
  * and computes and outputs Af, the face area of a regular tetrahedron. 
  * State your answer as an integer.

  * @author:E. Fabroa
  */
  
  public void run() {
    int intSideA;
    int intFaceArea;

    // prompt for side A
    intSideA = readInt("Enter the length of side a: ");

    // calculate face area
    intFaceArea = (int)(Math.pow(intSideA, 2) * (Math.sqrt(3)/4));

    // output face area
    System.out.println("The area of a regular tetrahedron with side length " + intSideA + " is " + intFaceArea + ".");
   
  }
}
