//        Создать множество, ключ и значение строки. Добавить шесть элементов. Вывести в консоль значения.
//        Добавить ко всем значениям символ "!".
//        Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключеми первого.
//        Объеденить значания во втором множестве и первом если ключи совподают. Вывести результат в консоль.



import java.util.*;

public class lesson_5 {

    public static void main(String[] args) {

        // Создать множество, ключ и значение строки. Добавить шесть элементов.
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("1", "Иван");
        map1.put("3", "Ян");
        map1.put("4", "Виктор");
        map1.put("5", "Марат");
        map1.put("7", "Георгий");
        map1.put("8", "Кирилл");

        // Вывести в консоль значения.
        Iterator<String> iter = map1.keySet().iterator();
        while (iter.hasNext()){
            String key = iter.next();
            System.out.println(key + " ~ " + map1.get(key));   // для большей наглядности, вывел и ключи
        }

        // Добавить ко всем значениям символ "!".
        for (String key: map1.keySet()) {
            map1.compute(key, (k, v) -> v+"!");
            // map1.merge(key, "!", String::concat);  Можно и так
        }

        // Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключеми первого.
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("1", "ИП");
        map2.put("2", "Дворник");
        map2.put("4", "Машинист");
        map2.put("5", "Продавец");
        map2.put("6", "Технолог");
        map2.put("8", "Врач");
        map2.put("10", "Зоолог");

        // Объеденить значания во втором множестве и первом если ключи совподают. Вывести результат в консоль.
        var m1 = new HashSet<>(map1.keySet());
        m1.addAll(map2.keySet());

        HashMap<String, String> map3 = new HashMap<>();
        for (String key: m1)  map3.put(key, map1.getOrDefault(key, "") +
                (map1.containsKey(key) && map2.containsKey(key) ? " – " : "")
                + map2.getOrDefault(key, ""));



        System.out.println();
        for (String key : map3.keySet())  System.out.println(key + " ~ " + map3.get(key));
    }
}
