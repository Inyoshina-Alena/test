public class Cat {

    private double weight;
    private String name;
    private  int age;
    private String color;
    private static int catCount; //Статичное поле

    //Конструктор по умолчанию
    public Cat() {
        this(3000, "Barsik", age, color = "Grey");
    }

    //Конструктор принимающий параметры
    public Cat(double weight, String name,int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        catCount++; //Увеличиваем счетчик кошек
    }

    public double getWeight() {
        return weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //Кошки не полодеют!
        if (age > this.age);
            this.age = age;
    }

    public String getColor() {
        return color;
    }

    //Метод толко для садистов
    public void setColor(String color) {
        this.color = color;
        //и так жалобно
        meow(); meow(); meow();
    }

    public void meow() {
        System.out.println("Meow");
    }

    private void pee() {
       weight -=20;
    }

    public void eat() {
        weight += 50;
        //сами вызываем свою функцию, если надо
        if (50/ weight >.01)
            pee();
    }
}
