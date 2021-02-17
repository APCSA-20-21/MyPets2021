public  class Main
{
  public static void main(String[] args)
  {
    // PetParent blankPet = new PetParent("Bob", true, "yellow-purple", 2, 0.9);
//Showing polymorphic instantiation
    PetParent nutmeg = new Dog("Nutmeg", true, "brown", 10, 0.9,true, 9, "mutt");//to remove

    Owner bob = new Owner("Bob");
/*
    System.out.println(nutmeg.dailyRoutine());
    System.out.println(nutmeg.speak());
    System.out.println(((Dog)nutmeg).getLoyalty()); //casting to access lower methods
*/
    Dog piper = new Dog("Piper", true, "black and white", 10, 0.5, false, 8, "Australian Shepherd");

    System.out.println(bob.feed(piper));
    System.out.println(bob.feed(nutmeg));
    
   // System.out.println(piper.getLoyalty());

    Axolotl matthew = new Axolotl("Matthew", false, "pink", 5, 0.6, true);

  System.out.println(bob.feed(matthew));

    PetParent[] pets = {nutmeg, piper, matthew};

    //uses for polymorphism

  for(PetParent animal: pets)
    {
      System.out.println(bob.ownersRoutine(animal));
    }
/*
    for(PetParent animal: pets)
    {
      System.out.println(animal.speak());
    }
*/
    // blankPet.setName("Fluffy");
    // System.out.println("Bob is now called " + blankPet.getName());
    // System.out.println(piper.dailyRoutine());
    // System.out.println(matthew.dailyRoutine());

    // System.out.println("Piper says " + piper.speak());
    // System.out.println("Matthew says " + matthew.speak());

/*
    System.out.println(blankPet.toString());
    System.out.println("\n---------------------\n");
    System.out.println(piper.toString());
    System.out.println("\n---------------------\n");
    System.out.println(matthew.toString());
  */
  }//end main method
}//end Main class aka the Driver