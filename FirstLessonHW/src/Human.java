// Класс для домашнего задания из первого урока
class Human
{
    // Минимальное значение возраста
    public final int MIN_AGE = 0;
    // Максимальное значение возраста
    public final int MAX_AGE = 120;

    // Приватное поле int age
    private int age;

    // Геттер для приватного поля age
    public int getAge() {
        return age;
    }

    // Сеттер для приватного поля age
    // С валидацией на допустимый возраст от 0 до 120
    public void setAge(int age) {
        // Проверка, что возраст указан в допустимом диапазоне
        if(age >= MIN_AGE && age <= MAX_AGE)
        {
            // Присвоение значения возрасту
            this.age = age;
        }
    }
}