package Day_16
fun main(args: Array<String>) {
   val game = Game()
    val map = Map()
    var validMove = true
    while (validMove){
        print("Enter a direction: n/s/e/w: ")
        val direction = readLine()
        validMove = map.updateLocation(direction)
        if (validMove)
            game.makeMove(direction)
    }
    game.end()
}
class Game{
    var path: MutableList<Directions> = mutableListOf(Directions.START)
    var north = {path.add(Directions.NORTH)}
    var south = {path.add(Directions.SOUTH)}
    var east = {path.add(Directions.EAST)}
    var west = {path.add(Directions.WEST)}
    var end = {path.add(Directions.END)
    println("Game Over: $path")
        path.clear()
        false
    }
    private fun move(where: () -> Boolean){
        where()
    }
    fun makeMove(direction: String?){
        when(direction){
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}