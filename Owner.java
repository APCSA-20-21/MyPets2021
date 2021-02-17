public class Owner
{
  String name;

  public Owner(String name)
  {
    this.name = name;
  }

  public String feed(PetParent p)
  {
    return "Time to feed " + p.getName();
  }

  public String ownersRoutine(PetParent p)
  {
    return this.name + " knows " + p.dailyRoutine();
  }

  public String toString()
  {
    return "I am " + name;
  }
}