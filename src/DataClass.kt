fun main() {

    val person = Person(1, "Smit", "C","India")
    val person1 = Person(1, "Pappu", "C","India")

    println(person)
    println(person == person1)
    println(person.combinedName)
}

data class Person(val id: Int, val fname: String, val lname: String, val country: String) {

    val combinedName
        get() = fname + lname

}
