package lesson_7;

        import java.util.ArrayList;
        import java.util.List;


public class VendingDrink {


    private final List<HotDrink> list;

    public VendingDrink() {
        list = new ArrayList<>();
    }

    void addHotDrink(HotDrink drink) {
        list.add(drink);
    }

    HotDrink getHotDrink(String kind) {
        for (HotDrink drink : list) {
            if (kind.equals(drink.getKind())) {
                return drink;
            }
        }
        return null;
    }

    HotDrink getHotDrink(Long id) {
        for (HotDrink drink : list) {
            if (id.equals(drink.getId())) {
                return drink;
            }
        }
        return null;
    }

    HotDrink getHotDrink(int temperature) {
        for (HotDrink drink : list) {
            if (temperature == drink.getTemp()) {
                return drink;
            }
        }
        return null;
    }

    HotDrink getHotDrink1(String kind, double price, int temperature) {
        for (HotDrink drink : list) {
            if (temperature == drink.getTemp()
                    && kind.equals(drink.getKind())
                    && price == drink.getPrice()) {
                return drink;
            }
        }
        return null;
    }

    HotDrink getHotDrink1(String kind, double price) {
        for (HotDrink drink : list) {
            if (kind.equals(drink.getKind())
                    && price == drink.getPrice()) {
                return drink;
            }
        }
        return null;
    }

    HotDrink getHotDrink1(String kind) {
        for (HotDrink drink : list) {
            if (kind.equals(drink.getKind())) {
                return drink;
            }
        }
        return null;
    }
}