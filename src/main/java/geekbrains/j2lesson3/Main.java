package geekbrains.j2lesson3;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        firstTask();

        Telephone telephone = new Telephone();
        telephone.add("Петров", 89031827378L);
        telephone.add("Петров", 89958998403L);
        telephone.add("Петрова", 89671424250L);
        telephone.info("Петров");
        telephone.info("Петрова");
        telephone.info("Огурлиев");
    }

    public static void firstTask() {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        list.add("Меркурий");
        list.add("Венера");
        list.add("Земля");
        list.add("Марс");
        list.add("Меркурий");
        list.add("Юпитер");
        list.add("Меркурий");
        list.add("Сатурн");
        list.add("Уран");
        list.add("Земля");
        list.add("Нептун");
        list.add("Плутон");
        list.add("Юпитер");
        list.add("Земля");
        list.add("Марс");
        list.add("Меркурий");
        list.add("Юпитер");
        list.add("Меркурий");
        list.add("Сатурн");
        list.add("Уран");
        for (String a:list) {
            if (map.containsKey(a)) {
                int i = map.get(a);
                map.put(a, i+1);
            }
            else {
                map.put(a,1);
            }
        }

        for (Map.Entry<String, Integer> e: map.entrySet()) {
            System.out.println(e.getKey() + " встречается " + e.getValue());
        }
    }


}
