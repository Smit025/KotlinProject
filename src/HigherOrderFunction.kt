


fun main(){

        val answer :(Int)->Unit  = {it-> println("$it")}
        rollDice(1..10,12,answer)

}

fun rollDice(range:IntRange,time:Int,callback:(result:Int)->Unit){
    for(i in 1 until 5){
        callback(i)
    }
}