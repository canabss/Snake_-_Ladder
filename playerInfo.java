import java.util.Random;
class playerInfo{
  protected int roll;
  protected String name;
  protected String names;
	public int getDice(){
      Random in=new Random();
      roll= in.nextInt(6)+1;
      return this.roll;
   }
	public void setDice(int a){
		this.roll=a;
	}
   public String getName(){
      return this.name;
    }
    public String setName(String a){
      this.name=a;
      return a;
    }
    public String getNames(){
      return this.names;
    }
    public String setNames(String a){
      this.names=a;
      return a;
    }
}