fun main(){

    val coder = Coder("Ivan")
    coder.age = 54
    coder.displayAge(coder.age)
    coder.printMessage("I love to Code!")

}

abstract class Person{
    var age = 27

    fun displayAge(age:Int) {
        println("age is $age")
    }

    abstract fun printMessage(message:String)

}

class Coder(_name:String) : Person(){
    private val name = _name
    override fun printMessage(message: String) {
        println("Your name is $name")
        println("Personalised message: $message")
    }

}

