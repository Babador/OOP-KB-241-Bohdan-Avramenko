package lab03;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Старт тестування Лабораторної №3 ---");

        Sprint sprint = new Sprint(10, 3);

        UserStory story1 = new UserStory(1, "Авторизація", 5, null);

        boolean isStoryAdded = sprint.addUserStory(story1);
        System.out.println("UserStory додано до спринту: " + isStoryAdded);
        System.out.println("Поточна утилізація спринту (estimate): " + sprint.getTotalEstimate());

        Bug bug1 = Bug.createBug(2, "Помилка при вводі паролю", 2, story1);
        System.out.println("Чи вдалося створити баг для невиконаної сторі? " + (bug1 != null));

        story1.complete();
        System.out.println("UserStory виконано: " + story1.isCompleted());

        Bug bug2 = Bug.createBug(3, "Помилка після логіну", 2, story1);
        System.out.println("Чи вдалося створити баг тепер? " + (bug2 != null));

        if (bug2 != null) {
            boolean isBugAdded = sprint.addBug(bug2);
            System.out.println("Баг додано до спринту: " + isBugAdded);
        }

        System.out.println("Фінальна утилізація спринту: " + sprint.getTotalEstimate());
        System.out.println("--- Тестування завершено успішно ---");
    }
}