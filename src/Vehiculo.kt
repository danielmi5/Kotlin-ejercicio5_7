open class Vehiculo(val marca: String, val modelo: String,  val capacidadCombustible: Int){


    open fun mostrarInformacion(){
        println("Vehículo(marca = $marca, modelo = $modelo, capacidadCombustible = $capacidadCombustible)")
    }

    open fun calcularAutonomia(): Int = capacidadCombustible*10


}