package Day_16
enum  class Directions{
    NORTH, SOUTH, EAST, WEST, START, END
}
class Map(val width: Int = 5, val height: Int = 5){
    private var location = mutableListOf(3,3)
    fun updateLocation(direction: String?): Boolean{
        val newLocation = location
        when(direction){
            "n" -> newLocation[0] +=1
            "s" -> newLocation[0] +=1
            "e" -> newLocation[1] +=1
            "w" -> newLocation[1] +=1
        }
        return if(isInside(newLocation[0], newLocation[1])){
            location = newLocation
            printLocation()
            true
        } else{
            println("You cannot move outside the map!")
            false
        }
    }
    private fun printLocation(){
        println("X:  ${location[0]}, Y: ${location[1]}")
    }
    private fun isInside(x: Int, y: Int): Boolean{
        if(x < 1 || x > 5 || y < 1 || y > 5){
            return false
        }
        return true
    }
}