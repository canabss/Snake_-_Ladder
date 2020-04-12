class snakeAndLadder extends Main{
 
  public void cls(){
    try{
       new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    }catch(Exception q){
      System.out.print(q);
    }
    }
  public void getRules(int position1,int position2,int power1,int power2,String name,String names)throws Exception{
    System.out.print("\n***********************************************************************************\n");
Thread.sleep(100);
    System.out.print("\t\t\t\tSNAKE AND LADDER\n");
Thread.sleep(100);
    System.out.print("\tAttack Mode :\n\t\t 1=Roll Dice\t\t 2=Use Power\n");
Thread.sleep(100);
    System.out.print("\n\tGame Rules: \n\t\t*All Odd Numbers from the Board are Snakes Except for 5`s.\n\t\t*All Even Numbers from the Board are Ladders Except for 0`s.\n\t\t*Players will get 1 Power if their Position have Value of 5.\n\t\t*Players can Use Power if they have 1 or more Power.\n\t\t*Number of Power you Used*5  is the number of move Backwards \n\t\tof Players Opponent.\n");
Thread.sleep(100);
    System.out.print("\n*********************************************************************************\n");
    System.out.print("\t  "+name+"(P1):\t\t\t"+names+"(P2):\n\n");
Thread. sleep(100);
    System.out.println("\t\tPosition: "+position1+"\t\t\tPosition: "+position2);
Thread.sleep(100);
    System.out.println("\t\tCurrent Power: "+power1+"\t\tCurrent Power: "+power2+"\n");
Thread.sleep(100);
  }
  public int getBoard(int position,int positions, int x)throws Exception{
    int[][] arrValues= {{0,17,20,5,0,22,5,7,0,0},{0,5,0,0,0,5,22,0,0,0},{0,0,24,5,7,0,0,5,0,0},{0,5,28,9,26,5,24,12,0,0},{0,0,5,20,23,5,13,0,5,0},{5,0,9,12,26,0,0,5,0,0},{0,0,5,0,13,28,5,0,0,0},{0,23,0,5,10,0,0,0,5,0},{0,5,0,0,0,5,3,5,0,0},{0,0,3,5,0,0,10,0,17,0}};
     for (int[] gameBoard: arrValues) {
      System.out.println("<=====+=====+=====+=====+=====+=====+=====+=====+=====+=====+=====+=====+=====+=>"); 
        for(int snakeAndladders: gameBoard) {
        if ((x == position)&&(x==positions))
           System.out.print("| P1P2 "+snakeAndladders);
          else if (x == position)
           System.out.print("|P1 "+snakeAndladders+"\t");
          else if(x==positions)
            System.out.print("|P2 "+snakeAndladders+"\t");
          else
            System.out.print("| "+snakeAndladders+"\t");
          x++;
        Thread. sleep(100);
         }
            System.out.println("|");
} 
 System.out.println("<=====+=====+=====+=====+=====+=====+=====+=====+=====+=====+=====+=====+=====+=>");
    return position;
}
  public int getPosition(int position){
     switch (position){
            case 3: position=44;System.out.println("\t\t\tYou Got a Ladder! Move Up to Square 44!"); break;
            case 6: position=17;System.out.println("\t\t\tYou Got a Ladder! Move Up to Square 17!"); break;
            case 23: position=37;System.out.println("\t\t\tYou Got a Ladder! Move Up to Squate 37!"); break;
            case 33: position=66;System.out.println("\t\t\tYou Got a Ladder! Move Up to Square 66!"); break;
            case 35: position=55;System.out.println("\t\t\tYou Got a Ladder! Move Up to Square 55!"); break;
            case 38: position=54;System.out.println("\t\t\tYou Got a Ladder! Move Up to Square 54!"); break;
            case 75: position=97;System.out.println("\t\t\tYou Got a Ladder! Move Up to Squate 97!"); break;
            case 25: position=8;System.out.println("\t\t\tYou Got Bit by Snake! Slide Down to Square 8!"); break;
            case 53: position=34;System.out.println("\t\t\tYou Got Bit by Snake! Slide Down to Square 34!"); break;
            case 65: position=47;System.out.println("\t\t\tYou Got Bit by Snake! Slide Down to Square 47!"); break;
            case 72: position=45;System.out.println("\t\t\tYou Got Bit by Snake! Slide Down to Square 45!"); break;
            case 93: position=87;System.out.println("\t\t\tYou Got Bit by Snake! Slide Down to Square 87!"); break;
            case 99: position=2;System.out.println("\t\t\tYou Got Bit by Snake! Slide Down to Squate 2!"); break;
	}
    if (position>=100)
		position=100;
    else if(position<=0)
        position=0;
    return position;
}
  public int getPower(int position,int cPower){
    switch(position){
     case 4: case 7:  case 12: case 16: case 24: case 28: case 32: case 36: case 43: case 46: case 49: case 51: case 58: case 63: case 67: case 74: case 79: case 82: case 86: case 88: case 94:
                cPower+=1; System.out.println("\t\t\tYou got a power !");
                break;
      }
      return cPower;
  }
  }