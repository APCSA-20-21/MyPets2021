public abstract class PetParent
{
  private String name;
  public boolean hasHair;
  public String color;
  public int cuteness;//1-10 1: ugly
  public double friendliness; //% in decimal form

  public PetParent(String name, boolean hasHair, String color, int cuteness, double friendliness)
  {
    this.name = name;
    this.hasHair = hasHair;
    this.color = color;
    this.cuteness = cuteness;
    this.friendliness = friendliness;
  }

  //getters and setters
  public String getName()
  {
    return name;
  }//end name getters

  public void setName(String name)
  {
    this.name = name;
  }

  //brain method
  public String dailyRoutine()
  {
    return name + " likes to play in the morning and eat dinner at 5:00 PM";
  }//this got inherited

  public abstract String speak();  //this is an abstract method.  It has no body.

  public String toString()
  {
    return "Name = " + name +
            "\nhasHair = " + hasHair +
            "\ncolor = " + color +
            "\ncuteness (1-10) = " + cuteness +
            "\nfriendliness (% in decimal form) = " + friendliness;
  }
}