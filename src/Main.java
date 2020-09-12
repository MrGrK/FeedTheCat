public class Main {
    public static void main(String[] args) {

        Cat[] xCats = new Cat[]{
                new Cat("Гоша", 30),
                new Cat("Винс", 35),
                new Cat("Финик", 10),
                new Cat("Дымок", 15),
                new Cat("Федя", 18)
        };


        Plate xPlate = new Plate(100);

        feedAllCats(xCats, xPlate);
    }

    private static void feedAllCats(Cat[] pCats, Plate pPlate) {
        for (Cat cat: pCats) {
            cat.eat(pPlate);
            System.out.println(cat);
            pPlate.Info();
            if(!cat.checkCatHunger()){
                pPlate.addSomeFood(100);

                cat.eat(pPlate);
                System.out.println(cat);
                pPlate.Info();
            }
        }
    }
}
