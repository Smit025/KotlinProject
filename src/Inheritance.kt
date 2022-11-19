class KBSquare(var side: Int, scale: Float) : KBRectangle(side, side, scale) {
    override val name = "KBSquare"

}

open class KBRectangle(
    protected val width: Int, private val height: Int, private var scale: Float = 1F,
) : KBShape {

    val scaleWidth: Float
        get() = width * scale

    val scaleHeight: Float
        get() = height * scale

    override val scaleArea: Float
        get() = scaleWidth * scaleHeight
    override val name: String = "KBRectangle"
}

fun main() {
    val mySquare = KBSquare(4, 5f)
    println("${mySquare.scaleHeight} - ${mySquare.scaleWidth}")
    println(mySquare.name)
}