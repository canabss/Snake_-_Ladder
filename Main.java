import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.Exception;
public class Main{
  public static void main(String[] args)throws Exception {
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    Scanner scan =new Scanner(System.in);
    boolean answer=false,choose=false,choosen=false;
    String name="",names="",aa;
    int mpower=0,npower=0;
    snakeAndLadder snl=new snakeAndLadder();
    playerInfo pInfo=new playerInfo();
    System.out.println("\t\t|{~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*}|");
    System.out.println("\t\t|{1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 %%0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 }|");
    System.out.println("\t\t|{0 1 0 1 0 %%% 1 0 1 0 1%%%% 0 1 0 %%%%%%0 1 %%%%1 0 1 0 1 0 1 0 1 0 1 0 1 }|");
    System.out.println("\t\t|{1 0 1 0 %%% %%% 0 0 1 %%  %%  0 1%% 1  %%  %%  %% 1 0 1 0 1%%%1 0 1 0 %%% }|");
    System.out.println("\t\t|{0 1 0 %%% 1 %%%%% 1 0 1  %% 0 1 %%%%%%%%%%1 1 %%  0 1 0 1%%%%%%%%%%%%%% 1 }|");
    System.out.println("\t\t|{1 0 1%%%1 0 1 0 1 0 1  %%%%%%% %%%  1 0 %%% %%%%%%% 0 1%%%1 0 1 0 %%% 1 0 }|");
    System.out.println("\t\t|{0 1 1 0 %%% 0 1 0 1 0 %%%%% 0 1 0 1 0%%%0 0 1 0 1 0 1%%%%%%%%%%%%%% 1 0 1 }|");
    System.out.println("\t\t|{1 0 1 0 1 0 %%% 1 0 1 %%% %%% 0 1 0 1%%%1 1 0 1 0 1%%%1 0 1 0 %%% 1 0 1 0 }|");
    System.out.println("\t\t|{0 1 0 1 0 1 0 1%%%1 0 %%% 1 %%% 0 1 0%%%0 0 1 0 1%%%%%%%%%%%%%% 1 0 1 0 1 }|");
    System.out.println("\t\t|{1 0 %%%%%1 0 %%%1 0 1 %%% 0 1 %%% 0 1%%%1 1 0 1%%%1 0 1 0 %%% 1 0 1 0 1 0 }|");
    System.out.println("\t\t|{0 1 0 %%%0 %%%1 0 1 0 %%% 1 0 1 %%% 0%%%0 0 1%%%%%%%%%%%%%% 1 0 1 0 1 0 1 }|");
    System.out.println("\t\t|{1 0 1 0 %%% 1 0 1 0 1 %%% 0 1 0 1 %%%%%%1 1%%%1 0 1 0 %%% 1 0 1 0 1 0 1 0 }|");
    System.out.println("\t\t|{*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~}|");
    System.out.print("Loading...\n");Thread.sleep(3000); snl.cls();
    System.out.print("\t\tEnter Player 1 Name: ");
    name=pInfo.setName(scan.nextLine());Thread.sleep(1000);
    System.out.print("\t\tEnter Player 2 Name: ");
    names=pInfo.setNames(scan.nextLine()); Thread.sleep(1000);
snl.cls();
    System.out.println("\n\n\n\n\n\n\n\n\t\tGood Luck to Both of you the Game will Start in Few Seconds.");Thread.sleep(4000);
snl.cls();
    do{
       int playerOne=0,playerTwo=0,plyronePosition=0, plyrtwoPosition=0,x=1,ponecPower=0,ptwocPower=0,play,pow=0,pows=0;
     String pick;
      snl.getRules(plyronePosition,plyrtwoPosition,ponecPower,ptwocPower,name,names);
     snl.getBoard(plyronePosition, plyrtwoPosition,x);
    while(plyronePosition<=100 || plyrtwoPosition<=100){
        int ans=0,count=0;
    do {
          do{ try{
     System.out.print("\n\tChoose: \n\t\t[1] RollDice\t\t[2] Use Power\n\t"+pInfo.getName()+"(P1):");
     pick=sc.readLine();
     ans=Integer.parseInt(pick);
     if (ans== 1){
     playerOne = pInfo.getDice(); Thread.sleep(1000);
     System.out.println("\t"+pInfo.getName()+"(P1) Rolled: "+playerOne);
     plyronePosition+=playerOne;
     plyronePosition=snl.getPosition(plyronePosition);Thread.sleep(1000);
     ponecPower=snl.getPower(plyronePosition,ponecPower);Thread.sleep(1000);
    }
    else if (ans == 2){
	   if(ponecPower==0)
        	System.out.println("\tUnable to use Power");
	   else {  
             System.out.println("\tUsed Power\n"); Thread.sleep(1000);
	     do{ do{ try{
	     System.out.println("\nHow many Power Do You Want to Use?");
	     aa=sc.readLine();
	     mpower=Integer.parseInt(aa);
	     if(mpower>ponecPower)
		System.out.println("Not Enough Power! Input Again");
	     else if (mpower<=0)
		System.out.print("Unable to Use Power with Less than 1 Power! Input Again");
		count=1;
	       }catch(Exception e){
           	 System.out.print("\tYou must input integer!");
           	 count=0;
           	 }} while(count==0);
		}while(mpower>ponecPower||mpower<=0);
	     ponecPower-=mpower;
             pow=mpower*5;
             plyrtwoPosition-=pow;
             System.out.print("\t\t"+pInfo.getNames()+"(P2):Move "+pow+" Steps Backwards\n"); Thread.sleep(1000);
             plyrtwoPosition=snl.getPosition(plyrtwoPosition);Thread.sleep(1000);
             ptwocPower=snl.getPower(plyrtwoPosition,ptwocPower);Thread.sleep(1000);
                  break;
	    } 
	
    }
        else
        System.out.print("\t\tInvalid Input");
            count=1;
              choose=((ans==1)||(ans==2&&ponecPower!=0));
            }catch(Exception e){
            System.out.print("\tYou must input integer!");
            count=0;
          } }while(count==0);
       
        }while(choose==false);
	snl.cls();
        snl.getRules(plyronePosition,plyrtwoPosition,ponecPower,ptwocPower,name,names);
     		snl.getBoard(plyronePosition,plyrtwoPosition,x);
        if(plyronePosition>=100){
           System.out.println("\n\t\t\t  *****"+pInfo.getName()+"(P1) Wins*****");
        break; }
     do {
         do{ try{
     System.out.print("\n\tChoose: \n\t\t[1] Roll Dice\t\t[2] Use Power\n\t"+pInfo.getNames()+"(P2):");
     pick=sc.readLine();
     ans=Integer.parseInt(pick);
     if (ans == 1){
     playerTwo= pInfo.getDice(); Thread.sleep(1000);
     System.out.println("\t"+pInfo.getNames()+"(P2) Rolled: "+playerTwo);
     plyrtwoPosition+= playerTwo;
     plyrtwoPosition=snl.getPosition(plyrtwoPosition);Thread.sleep(1000);
     ptwocPower=snl.getPower(plyrtwoPosition,ptwocPower);Thread.sleep(1000);
    }
    else if (ans == 2){
     if(ptwocPower==0)
	        System.out.println("\tUnable to use Power");
	   else {
              System.out.println("\tUsed Power\n"); Thread.sleep(1000);
	      do{ do{ try{
	      System.out.println("\nHow many Power Do You Want to Use?");
	      aa=sc.readLine();
	      npower=Integer.parseInt(aa);
	      if (npower>ptwocPower)
		System.out.print("Not Enough Power! Input Again");
	      else if (npower<=0)
		System.out.print("Unable to Use Power with Less than 1 Power! Input Again");
		count=1;
	       }catch(Exception e){
           	 System.out.print("\tYou must input integer!");
           	 count=0;
           	 }} while(count==0);
	      }while(npower>ptwocPower||npower<=0);
	      ptwocPower-=npower;
              pows=npower*5;
              plyronePosition-=pows;
              System.out.print("\t"+pInfo.getNames()+"(P1): Move "+pows+" Steps Bacwards\n"); Thread.sleep(1000);
              plyronePosition=snl.getPosition(plyronePosition);Thread.sleep(1000);
              ponecPower=snl.getPower(plyronePosition,ponecPower);Thread.sleep(1000);
              continue;
		}
    }
        else
        System.out.print("\t\tInvalid Input");
            count=1;
              choosen=((ans==1)||(ans==2&&ptwocPower!=0));
           }catch(Exception e){
            System.out.print("\tYou must input integer!");
            count=0;
            }} while(count==0);
          
        }while(choosen==false);
	snl.cls();
        snl.getRules(plyronePosition,plyrtwoPosition,ponecPower,ptwocPower,name,names);
     	snl.getBoard(plyronePosition,plyrtwoPosition, x);
      if(plyrtwoPosition>=100){
           System.out.print("\n\t\t\t  *****"+pInfo.getNames()+"(P2) Wins*****");
        break; }
    }
        System.out.println("\n\n\t\tRematch ?\n\t\t\t   [1] Yes \n\t\t\t   [2] Exit");
        play=0;
      do{
       int count=0;do{try{
        aa=sc.readLine();
        play=Integer.parseInt(aa);
        scan.nextLine();
        count=1;
      switch(play){
        case 1: continue;   
        case 2: System.exit(0); break;
        default: System.out.println("\t\tInvalid input");
              }
      
      answer=((play==1)||(play==2));
          }catch(Exception e){
            System.out.println("\tYou must input integer!");
            count=0;
            }} while(count==0);
            answer=((play<1)||(play>2));
           }while(answer==true);
  }while(answer==false);
  }	
}