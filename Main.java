public  class Main
{
  public static void main(String[] args)
  {
    // PetParent blankPet = new PetParent("Bob", true, "yellow-purple", 2, 0.9);

    PetParent nutmeg = new Dog("Nutmeg", true, "brown", 10, 0.9,true, 9, "mutt");//to remove

    System.out.println(nutmeg.dailyRoutine());
    System.out.println(nutmeg.speak());
    //System.out.println(nutmeg.getLoyalty());

    Dog piper = new Dog("Piper", true, "black and white", 10, 0.5, false, 8, "Australian Shepherd");

    Axolotl matthew = new Axolotl("Matthew", false, "pink", 5, 0.6, true);

    PetParent[] pets = {nutmeg, piper, matthew};

    for(PetParent animal: pets)
    {
      System.out.println(animal.speak());
    }

    // blankPet.setName("Fluffy");
    // System.out.println("Bob is now called " + blankPet.getName());
    System.out.println(piper.dailyRoutine());
    System.out.println(matthew.dailyRoutine());

    System.out.println("Piper says " + piper.speak());
    System.out.println("Matthew says " + matthew.speak());

/*
    System.out.println(blankPet.toString());
    System.out.println("\n---------------------\n");
    System.out.println(piper.toString());
    System.out.println("\n---------------------\n");
    System.out.println(matthew.toString());
  */
  }//end main method
}//end Main class aka the Driver