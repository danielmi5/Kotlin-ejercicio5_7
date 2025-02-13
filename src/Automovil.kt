class Automovil(marca: String, modelo: String, capacidadCombustible: Int, val tipo: String = "SUV"): Vehiculo(marca, modelo, capacidadCombustible){
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia()+100
    }

    override fun mostrarInformacion() {
        println("Vehículo(marca = $marca, modelo = $modelo, capacidadCombustible = $capacidadCombustible, tipo = $tipo)")
    }
}