import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {



        // Создаем объект класса Human
        Human human = new Human();
        // Задаем значение возраста через сеттер
        human.setAge(25);

        // Выводим значение возраста через геттер
        System.out.println("Значение возраста: " + human.getAge());

        // Блок для отлова исключения
        try
        {
            // Задание невалидного значения при помощи рефлексии
            Field field = human.getClass().getDeclaredField("age");
            // Дается доступ для работы с полем
            field.setAccessible(true);
            field.set(human, 1050);
        }
        // Блок обработки исключения
        catch (NoSuchFieldException | IllegalAccessException e)
        {
            // Прочитал, что плохо использовать и лучше использовать фреймворки для логирования
            // Пока не разбирался
            e.printStackTrace();
        }
        // Блок, выполняющийся после try ... catch ... в любом случае
        finally {
            // Вывод невалидного значения
            System.out.println("Новое значение возраста: " + human.getAge());
        }

        // Вывод значения поля в консоль без использования геттера
        // Блок для отлова исключения
        try
        {
            // Задание невалидного значения при помощи рефлексии
            Field field = human.getClass().getDeclaredField("age");
            // Дается доступ для работы с полем
            field.setAccessible(true);
            System.out.println("Новое значение возраста не через геттер: " + field.get(human));
        }
        // Блок обработки исключения
        catch (NoSuchFieldException | IllegalAccessException e)
        {
            // Прочитал, что плохо использовать и лучше использовать фреймворки для логирования
            // Пока не разбирался
            e.printStackTrace();
        }
    }
}