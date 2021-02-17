public class Owner
{
  private String name;

  public Owner (String name)
  {
    this.name = name;
  }

  public String feed(PetParent pet)
  {
    return "Time to feed " + pet.getName() + "!";

  }

  public String toString()
  {
    return "I am " + this.name;
  }


}