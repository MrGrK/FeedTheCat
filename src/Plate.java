public class Plate {
    private int foodCnt;

    public Plate(int pFoodCnt){
        foodCnt = pFoodCnt;
    }

    public int getFoodCnt() {
        return foodCnt;
    }

    public boolean decreaseFoodCnt(int amount) {
        if(amount>foodCnt)
            return false;
        this.foodCnt -= amount;
        return true;
    }

    public void addSomeFood(int amount) {
        foodCnt+=amount;
        System.out.println("Добавили " + amount +" единиц еды.");
    }

    public void Info(){
        System.out.println("Осталось " + this.foodCnt +" единиц еды.");
    }

    @Override
    public String toString(){
        return "Plate{"+
                "food="+ foodCnt+
                '{';
    }
}
