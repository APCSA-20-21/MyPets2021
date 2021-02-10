public class Axolotl extends PetParent
{
  //instance variables
  private boolean hasRegenerated;
  //constructors
  public Axolotl(String name, boolean hasHair, String color, int cuteness, double friendliness, boolean hasRegenerated)
  {
    super(name, hasHair, color, cuteness, friendliness);
    this.hasRegenerated = hasRegenerated;
  }//end full constructor

  //overridden method
  
  public String dailyRoutine()
  {
    return super.getName() + " will sleep whenever, eat whenever, then float.";
  }

  public String speak()
  {
    if (hasRegenerated)
    {
      return "gurgles";
    }
    else
    {
      return "bloop";
    }
  }

  //toString
  public String toString()
  {
    String output = super.toString();
    output += "\nhas it regenerated = " + hasRegenerated;
    return output;
  }//end toString

}//end class