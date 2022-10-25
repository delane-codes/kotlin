fun main() {
    val droneName = mutableListOf("Viper","Ghost")
    val droneType = arrayOf("QuadDrone","Copter")
    val rotters = arrayListOf(1,2,5,4,3)
    val quadDrone: String? = "mini-drone"
    val droneSize = arrayOf(quadDrone,"large")
    val cargo = true
    val luggageType = arrayOf("Dirt", "Weapons", "Food")

    var x =1
    while (x < 10){
        if (x >3){
            println("big $x")
        }
        x++
    }

    println("Drone Name: ${droneName[0]}")
    println("Type: ${droneType[1]}")
    println("Rotters: ${rotters[0]}")
    println("Size: ${droneSize[1]}")
    println( "Flight Time: ${droneFlightTime()} hrs")

    if (cargo){
        println("Available cargo space")
    }else{
        println("No cargo space")
    }

    when(cargo){
        true -> println("Carrying ${luggageType[1]}")
        false -> println("Carrying nothing")
    }


    println()
    return droneName.forEach { available -> println("Available : $available") }



}//end of main

fun droneFlightTime(): Double {
    return 6.0
}//end of droneFlightTime()
