class Motocicleta(marca: String, modelo: String, capacidadCombustible: Int, val cilindrada: Int = 1000) : Vehiculo(marca, modelo, capacidadCombustible){
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia()-40
    }

    override fun mostrarInformacion() {
        println("Vehículo(marca = $marca, modelo = $modelo, capacidadCombustible = $capacidadCombustible, cilindrada = $cilindrada)")
    }
}
