package registrator;

import java.util.Scanner;

public class UserRegistrator {
    public static boolean checkName(String name) {
        if (name.equals("")) {
            System.out.println("Пустое имя, попробуйте ещё раз");
            return false;
        } else {
            System.out.println("Имя корректно, продолжайте...");
            return true;
        }
    }

    public static String regName() {
        System.out.println("Введите имя:");
        return new Scanner(System.in).nextLine();
    }

    public static boolean checkAge(int age) {
        if (age <= 18) {
            System.out.println("Ваш возраст меньше 18, вход запрещен...");
            return false;
        } else {
            System.out.println("Возраст больше 18, добро пожаловать!");
            return true;
        }
    }

    public static int regAge() {
        System.out.println("Введите возраст:");
        return new Scanner(System.in).nextInt();
    }
}
