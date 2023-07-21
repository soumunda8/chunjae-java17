package sec2;

import java.util.*;
import java.util.Map.*;

public class MapEx1 {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, String> map2 = new Hashtable<>();
        Map<String, Integer> map3 = new TreeMap<>();
        Properties map4 = new Properties();        // Properties 는 제너릭 타입이 안됨

        map1.put("no", 1);
        map1.put("kor", 100);
        map1.put("eng", 85);
        map1.put("mat", 90);
        System.out.println(map1);
        System.out.println("국어 점수 : " + map1.get("kor"));

        if(map1.containsKey("soc")) {
            System.out.println("해당 키가 존재합니다.");
        } else {
            map1.put("soc", 100);
        }
        
        if(map1.containsValue(100)) {
            System.out.println("만점 과목이 있습니다.");
        } else {
            System.out.println("만점 과목이 없습니다.");
        }

        // entrySet : 데이터의 뭉치 = 하나하나의 데이터를 모아서 가지고 있는 객체
        // 인덱스가 없어서, 키 값으로 넣어줘야 하기때문에 entrySet 을 써야 함
        // ★맴의 순회 방법 - 접근 방법★
        for(Entry<String, Integer> entrySet : map1.entrySet()) {
            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }

        map2.put("name", "ParkNaYeon");
        map2.put("age", "20");
        map2.put("height", "162.8");
        map2.put("weight", "45");
        System.out.println(map2);
        if (map2.containsKey("weight")) {
            map2.remove("weight");
        } else {
            System.out.println("해당 키가 존재하지 않음");
        }
        System.out.println("이름 : " + map2.get("name"));

        // 해쉬테이블(HashTable) 의 순회
        for(Entry<String, String> entrySet : map2.entrySet()) {
            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }

        map3.put("no", 1);
        map3.put("age", 20);
        map3.put("height", 161);
        map3.put("weight", 45);
        System.out.println(map3);
        if (map3.containsKey("weight")) {
            map3.remove("weight");
        } else {
            System.out.println("해당 키가 존재하지 않음");
        }
        System.out.println("이름 : " + map3.get("name"));

        // 트리맵(TreeMap) 의 순회
        for(Entry<String, Integer> entrySet : map3.entrySet()) {
            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }

        map4.setProperty("margin", "40px");
        map4.setProperty("padding", "30px");
        map4.setProperty("width", "1200px");
        map4.setProperty("height", "50px");
        System.out.println("폭 : " + map4.getProperty("width"));

    }

}