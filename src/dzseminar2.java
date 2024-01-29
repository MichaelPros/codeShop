//PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class dzseminar2 {
    public static void main(String[] args) {
        String query = "select * from students where ";
        String params = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        String[] ss = params.strip().split("\"|\\,|\\:|\\}|\\{|\\s");
        List<String> ss1 = new ArrayList<String>();
        StringBuilder joinString = new StringBuilder();
        for (int i = 0; i < ss.length; i++) {
            if (ss[i].isEmpty() || ss[i] == " ") {
                continue;
            } else {
                ss1.add(ss[i]);
            }
        }
        for (int i = 0; i < ss1.size(); i++) {
            if (ss1.get(i).equals("null")) {
                ss1.remove(i);
                ss1.remove(i - 1);

            }
            System.out.println(ss1);
        }
        switch (ss1.size()) {
            case 8:
                System.out.println(query + ss1.get(0) + "='" + ss1.get(1) + "' and " + ss1.get(2) + "='" + ss1.get(3) + "' and " + ss1.get(4) + "='" + ss1.get(5) + "' and " + ss1.get(6) + "='" + ss1.get(7) + "'");
                break;
            case 6:
                System.out.println(query + ss1.get(0) + "='"+ss1.get(1) + "' and "+ss1.get(2)+"='" +ss1.get(3)+"' and "+ss1.get(4)+"='"+ss1.get(5)+"'");
                break;
            case 4:
                System.out.println(query + ss1.get(0) + "='"+ss1.get(1) + "' and "+ss1.get(2)+"='"+ss1.get(3)+"'");
                break;
            case 2:
                System.out.println(query + ss1.get(0) + "='"+ss1.get(1)+"'");
                break;


        }


//        System.out.println("select * from students where " + ss1.get(0) + "='"+ss1.get(1)
//                + "' and "+ss1.get(2)+"='" +ss1.get(3)+"' and "+ss1.get(4)+"='"+ss1.get(5)+"'");
//        for (String elem: ss){
//            System.out.println(elem);
//        }
//        for (int i = 0; i < ss1.size(); i++) {
//            if(ss1.isEmpty()){
//                ss1.remove(i);
//            }
//
//        }
//        System.out.println(ss1);

//        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
//        Pattern patter = Pattern.compile("\\s*(\\s|,|!|:|\\.)\\s*");
//        String[] collString = patter.split(PARAMS);
//        for (String word: collString) {
//            System.out.println(word);
//
//        }
//        System.out.println(collString.length);

    }

//    public static StringBuilder answer(String QUERY, String PARAMS){
//        StringBuilder getString = new StringBuilder();
//        String query = "select * from students where ";
//        String params = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
//        String[] ss = params.strip().split("\"|\\,|\\:|\\}|\\{|\\s");
//        List<String> ss1 = new ArrayList<String>();
//        for (int i = 0; i < ss.length; i++) {
//            if (ss[i].isEmpty() || ss[i] == " ") {
//                continue;
//            } else {
//                ss1.add(ss[i]);
//            }
//        }
//        getString.append("wow");
//        return getString;
//    }
}