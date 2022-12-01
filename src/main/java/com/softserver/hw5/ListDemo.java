package com.softserver.hw5;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        //----------------1---------------
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 25, 30, 10, 15, 35, 40, 45, 55, 50, 60));
        System.out.println(searchAverageOfOdd(list));
        //----------------2------------------
        String[] strings = {
                "Some say the world will end in fire,",
                "Some say in ice.",
                "From what I’ve tasted of desire",
                "I hold with those who favor fire.",
                "But if it had to perish twice,",
                "I think I know enough of hate",
                "To say that for destruction ice",
                "Is also great",
                "And would suffice.",

        };
        System.out.println(numberOfUniqueStrings(strings));
        //-----------------3--------------------
        Map<String, Integer> map = new HashMap<>();
        map.put("124054", 1);
        map.put("155544w", 67);
        map.put("4540ssss6", 34);
        map.put("sdfghj", 99);
        map.put("vcssgfcd", 80);
        map.put("fed", 777);
        System.out.println(sumOfAllValuesLessThan(map, 7));
        //------------------4--------------------
        System.out.println(concatenationOfArrayElements(list));
        //------------5---------------------------
        Person[] people = new Person[]{
                new Person("Tom", "Soir", 35),
                new Person("Enton", "Jon", 35),
                new Person("Zora", "Kell", 56),
                new Person("Ram", "Uno", 12),
                new Person("Anna", "Luto", 7)};
        System.out.println(fullNameTheOldestMan(people));
    }

    public static double searchAverageOfOdd(List<Integer> list) {
        double arg = 0;
        int num = 0;
        for (Integer in : list) {
            if (in % 2 == 1 && in % 5 == 0) {
                arg += in;
                num++;

            }
        }
        return arg / num;
    }

    public static int numberOfUniqueStrings(String[] strings) {
        Set<String> mySet = new HashSet<>();
        for (String x : strings) {
            if (x.replaceAll("\\s+", "").length() > 8) {
                mySet.add(x);
            }
        }
        return mySet.size();
    }

    public static int sumOfAllValuesLessThan(Map<String, Integer> map, int num) {
        int sum = 0;
        for (String key : map.keySet()) {
            if (key.length() < num) {
                sum += map.get(key);
            }
        }
        return sum;
    }

    public static String concatenationOfArrayElements(List<Integer> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer in : list) {
            stringBuilder.append(in);
        }
        return stringBuilder.toString();
    }

    public static String fullNameTheOldestMan(Person[] people) {
        Comparator<Person> personComparator = (o1, o2) -> {
            if (o1.getAge() == (o2.getAge())) {
                return o2.getFullName().compareTo(o1.getFullName());
            }

            return Integer.compare(o2.getAge(), o1.getAge());
        };
        Arrays.sort(people, personComparator);
        return people[0].getFullName();
    }
}
