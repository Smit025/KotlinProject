internal data class Emp(var name: String? = null, var age: Int? = null)

// Scope Function

fun main() {

    val emp = Emp("Susmit", 27)

    //'Let'
    //Let function return the last value in 'let' .It uses
    //if the last statement in a “let” block is a non-assignment statement,
    //“let” operator provides an option to perform an operation on the current object
    emp.let {
        it.name = "Smit"
        it.age = 27
    }
    println(emp)

    //'Run'
    //The “run” operator is similar to the “let” operator in terms of accepting a return value
    //run refers to the context of the object as “this”
    emp.run {
        this.name = "Smit"
        this.age = 27
    }
    println(emp)

    //'With'
    //Context of the object referred to as “this” is a nullable type
    //So performing a null check using a “with” operator is difficult a
    with(emp) {
        this.name = "John"
        this.age = 28
    }
    println(emp)

    //'Also'
    //The return type of 'also' is object
    //context of the object as “it”
    //It is similar in terms of functionality to let but the return type is object
    emp.also {
        it.name = "Sam"
        it.age = 29
    }
    println(emp)

    //'Apply'
    //The return type of 'apply' is object
    // referring to the context of the object as “this”
    emp.apply {
        this.name = "Smit"
        this.age = 27
    }
    println(emp)
}