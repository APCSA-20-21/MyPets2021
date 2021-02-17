public  class Main
{
  public static void main(String[] args)
  {
    // PetParent blankPet = new PetParent("Bob", true, "yellow-purple", 2, 0.9);

    Dog piper = new Dog("Piper", true, "black and white", 10, 0.5, false, 8, "Australian Shepherd");

    PetParent vader = new Dog("Vader", true, "brown", 4 , 0.02, false, 1, "Sheepdog");

    Axolotl matthew = new Axolotl("Matthew", false, "pink", 5, 0.6, true);

    PetParent clifford = new Axolotl("Clifford", true, "purple", 10, 0.01, false);

    

    // blankPet.setName("Fluffy");
    // System.out.println("Bob is now called " + blankPet.getName());

    System.out.println(vader.dailyRoutine());
    System.out.println(vader.speak());
    System.out.println(((Dog)vader).getLoyalty());
    System.out.println(clifford.dailyRoutine());

    PetParent[] myPets = {piper, vader, matthew, clifford};

    for(PetParent animals : myPets)
    {
      System.out.println(animals.getName() + " says " +animals.speak() + ".");
    }

    /*
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