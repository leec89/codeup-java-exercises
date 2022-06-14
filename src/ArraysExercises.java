import jdk.jshell.PersistentSnippet;

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {


        // 1. Array basics
//        int[] numbers = {1, 2, 3, 4, 5};
//        for (int n : numbers) {
//            System.out.println(n);
//        }
//
//        System.out.println(Arrays.toString(numbers));

        // 3 person objects into an array

        Person fred = new Person("Fred");
        Person wilma = new Person("Wilma");
        Person barney = new Person("Barney");
        Person[] flintstones = {fred, wilma, barney};

//        for (int i = 0; i < flintstones.length; i++ ) {
//            System.out.println(flintstones[i].getName());
//        }
//        for (Person person : flintstones) {
//            System.out.println(person.getName());
//        }

        Person betty = new Person("Betty");
        Person[] newFlintstones = newArrayAddPerson(flintstones, betty);
        for (int i = 0; i < newFlintstones.length; i++ ) {
            System.out.println(newFlintstones[i].getName());
        }
        System.out.println();
        for (Person person : newFlintstones) {
            System.out.println(person.getName());
        }
    }

    public static Person[] newArrayAddPerson(Person[] newArr, Person addPerson) {
        Person[] newPersonArr = Arrays.copyOf(newArr, newArr.length + 1);
        newPersonArr[newPersonArr.length - 1] = addPerson;
        return newPersonArr;
    }
}
