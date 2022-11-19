fun main() {
    println(Manager)
    println(Employee.getInstance())

    val data:Int?=null
    val result  = data ?: getData()

    println(result)

}

object Manager {
    init {
        print("Manager object is initialized")
    }
}

class Employee private constructor() {

    companion object {
        private val instance: Employee? = null
        fun getInstance() = instance ?: synchronized(this) {

            instance ?: Employee()

        }

    }
}
