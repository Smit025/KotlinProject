sealed class Data {


    data class Success(val data: String) : Data()
    data class Error(val msg: String) : Data()
    object Loading : Data()
}

fun getData(): Data {

    return Data.Error((10..100).random().toString())

}

fun main() {

    val data = getData()

    val result = when (data) {
        is Data.Success -> "Lovedu"
        is Data.Error -> "Lasan"
        is Data.Loading -> "Loveda lasan"
    }
println(result)

}