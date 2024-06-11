import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Apples apple1 = new Apples(5,100, "green");
        Apples apple2 = new Apples(6,120, "red");
        Apples apple3 = new Apples(7,140, "yellow");
        Meat chicken =new Meat(9, 800);
        Meat beef =new Meat(10, 1000);
        Meat pork =new Meat(8, 900);
        Food rice= new Food(6,700);
        Food cheese= new Food(11,400);

        ArrayList<Apples> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);

        ArrayList<Meat> meat = new ArrayList<>();
        meat.add(beef);
        meat.add(chicken);
        meat.add(pork);

        ArrayList<Food> food = new ArrayList<>();
        food.add(rice);
        food.add(cheese);
        food.addAll(apples);
        food.addAll(meat);
        System.out.println(food);
        food.removeAll(apples);
        System.out.println("Не отсортированный список" + food);
        System.out.println(food.get(4));

        BubbleSort(food);
        System.out.println("Отсортированный список" + food);

    }
    public static void BubbleSort(ArrayList<Food> food){// Сортировка еды по массе
        boolean flag;
        for (int i = 0; i < food.size()-1; i++) {
            flag = false;
            for (int j = 0; j < food.size()-1-i; j++) {
                if (food.get(j).getWeightInGr() > food.get(j+1).getWeightInGr()){
                    Food t=food.get(j);
                    food.set(j, food.get(j+1));
                    food.set(j+1, t);
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }
}
