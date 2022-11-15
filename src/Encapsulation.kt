


data class Encapsulation(protected val width: Int, private val height: Int,private var scale: Float = 1F) {

    val scaleWidth: Float
        get() = width * scale

    val scaleHeight: Float
        get() = height * scale
}

fun main() {

    val encapsulation = Encapsulation(2, 4,12f)
    println(encapsulation.scaleWidth)

}