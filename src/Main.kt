//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {   // Точка входа. Метод(Функция) - область кода. С точки входа начинается исполение программы
    println("Привет! ")            // Вывдим текст на консоль
    println("Мы изучаем Котлин")
    println("И нам это нравится!")

    var name: String           // Декларация переменной name типа String

    name = "Vlad"              // Инициализация(первое присвоение значение) переменной
    println(name)
    name = "Vladislav"
    println(name)
    val age: Int              // Объявляем константу - ее нельзя изменить
    age = 26
    println(age)
    // age = 35     Данныая строка вызовет ошибку

    /*
    Тип переменной указывает компилятору каким образом обрабатывать ее значение.
    Типы переменных:
    Целочисленные переменные TODO Заполнить диапазоны переменных
    Byte
    Short
    Int
    Long
    UByte
    UShort
    UInt
    ULong

    Числа с плавающей точкой(дробные числа)
    Float
    Double
    Логическое выражение
    Boolean

    Символ
    Char
     */

    println(name + " " +  age)

    var weight = 87              // Динамическое определение типа

    println("Вес: " + weight)
    weight = weight - 5;


    println("Вес: " + weight)

    var name1 = "Katya"

    var kWeight = 55
    println("Вес Кати : " + kWeight)

    kWeight = kWeight - 2
    println("Вес Кати : " + kWeight)

    println("Вес Влада " + addWeight(weight, 2))
    println("Вес Кати " + addWeight(kWeight, 3))

    val p1 = Person("Vlad", 26, 87.2)
    val p2 = Person(22, "Катya")

    p1.currentWeight()
    p1.addWeight(2)
    p1.loseWeight(7)
    println("Программа тренировок:")
    for (n in 1..5){              // Цикл
        p1.loseWeight(1)
        if(p1.weight <= 80 ){           // Условный оператор
            break                       // Прекращаем цикл, если похудели ниже 80 кг
        }
    }

    val p3 = Person("Yana", 27, 60.5)
    val array = arrayOf(p1, p2, p3)

    println("Групповая тренировка: ")
    for (n in 0..array.size-1){
        array[n].loseWeight(1)
    }

}

fun addWeight(weight: Int, change: Int): Int{
    var res = weight - change
    return res
}