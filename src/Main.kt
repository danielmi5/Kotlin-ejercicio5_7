fun main() {
    val coche = Automovil("Ferrari", "Deportivo", 10)
    val moto = Motocicleta("Suzuki", "De competición", 100)

    coche.mostrarInformacion()
    println("Autonomía: ${coche.calcularAutonomia()} Km")

    moto.mostrarInformacion()
    println("Autonomía: ${moto.calcularAutonomia()} Km")

}