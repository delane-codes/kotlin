fun main() {
    val  quadrone: String? = "mini-drone"
    val cargo = true

    println(quadrone)
    if (cargo){
        println("Available cargo space")
    }else{
        println("No cargo space")
    }

    when(cargo){
        true -> println("carrying dirt")
        false -> println("carrying nothing")
    }
}
