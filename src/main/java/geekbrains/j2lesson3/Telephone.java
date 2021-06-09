package geekbrains.j2lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Telephone {

    private HashMap<String, List<Long>> map = new HashMap<String, List<Long>>();
  
    public void add(String name, Long list){

        if (map.containsKey(name)){
            List<Long> l = map.get(name);
            l.add(list);
            map.replace(name,l);
        } else {
            List<Long> l = new ArrayList<>();
            l.add(list);
            map.put(name, l);
        }
    }

    public List<Long> get(String name) {
        return map.get(name);
    }

    public void info(String name){
        if(map.containsKey(name)){
            List<Long> l = map.get(name);
            System.out.print("У абонента по фамилии " + name + " есть такой/ие номера: ");
            for (Long e: l) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("Данного абонента нет в телефонной книге.");
        }

    }
}
