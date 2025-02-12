open class Vehiculo(val marca: String, val modelo: String,  val capacidadCombustible: Int){


    open fun mostrarInformacion(){
        println("Vehículo(marca = $marca, modelo = $modelo, capacidadCombustible = $capacidadCombustible)")
    }

    open fun calcularAutonomia(): Int = capacidadCombustible*10


}


class Automovil(marca: String, modelo: String, capacidadCombustible: Int, val tipo: String = "SUV"): Vehiculo(marca, modelo, capacidadCombustible){
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia()+100
    }

    override fun mostrarInformacion() {
        println("Vehículo(marca = $marca, modelo = $modelo, capacidadCombustible = $capacidadCombustible, tipo = $tipo)")
    }
}

class Motocicleta(marca: String, modelo: String, capacidadCombustible: Int, val cilindrada: Int = 1000) : Vehiculo(marca, modelo, capacidadCombustible){
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia()-40
    }

    override fun mostrarInformacion() {
        println("Vehículo(marca = $marca, modelo = $modelo, capacidadCombustible = $capacidadCombustible, cilindrada = $cilindrada)")
    }
}


fun main() {
    val coche = Automovil("Ferrari", "Deportivo", 10)
    val moto = Motocicleta("Suzuki", "De competición", 100)

    coche.mostrarInformacion()
    println(coche.calcularAutonomia())

    moto.mostrarInformacion()
    println(moto.calcularAutonomia())

}