public class Cat {

    private  String name;

    private int hungerLevel;

    private  boolean fullness;

    public  Cat(String pName, int pHungerLvl){
        name = pName;
        hungerLevel = pHungerLvl;
        fullness = false;
    }

    public boolean checkCatHunger(){
        return fullness;
    }

    public void eat(Plate pPlate)
    {
        if(fullness)
            return;
        System.out.println("Кот "+ this.name+ " ест...");
        fullness = pPlate.decreaseFoodCnt(hungerLevel);
    }

    @Override
    public String toString(){
        return "Кот " + name + (fullness?" наелся.": " не наелся.");
    }
}
