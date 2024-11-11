class Person {
    // Поля класса - атрибуты
    var name: String=""
    var age:Int = 0
    var weight:Double = 0.0


    //TODO Обратите внимание на разницу в названии параметров в конструкторах
    constructor(_name:String, _age:Int, _weight:Double){
        name = _name
        age = _age
        weight = _weight
    }

    constructor(age: Int, name: String) {
        this.age = age                        // this - ссылка на текущий экземпляр класса
        this.name = name
    }


    fun addWeight(change: Int){
        weight = weight + change            // Сохраняем результат в переменной объекта
        println(name +  " весит: " + weight )
    }

    fun loseWeight(change: Int){
        if(weight<= 0){            // Возвращаем управление, если вес меньше или равен нулю, в таком случае этот метод исполнен не будет
            return
        }
        weight = weight - change
        println(name +  " весит: " + weight )
    }

    fun currentWeight(){

        println(name +  " весит: " + weight)
    }







}