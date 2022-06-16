import rocketmission.assets.Rocket
import rocketmission.assets.Supplies
import rocketmission.simulator.SimulatorImplementation
lateinit var simulator: SimulatorImplementation
fun main() {
    simulator = SimulatorImplementation(rocketList = rocketList1, suppliesList = supplyList)
    simulator.executeSimulation()

}

val rocketList1: List<Rocket> = listOf(
    Rocket(name = "Coete 1", maxLoad = 34.0, crashChance = 0.70),
    Rocket(name = "Coete 2", maxLoad = 50.0, crashChance = 0.15),
    Rocket(name = "Coete 3", maxLoad = 43.0, crashChance = 0.31)
)

val supplyList: List<Supplies> = listOf(
    Supplies(name = "Water", weight = 2.0, quantity = 2),
    Supplies(name = "Food", weight = 3.0, quantity = 3),
    Supplies(name = "Oxygen", weight = 1.3, quantity = 2),
    Supplies(name = "Seeds", weight = 0.73, quantity = 10),
)












//fun execute(car: MyFirstCarClass) {
//    println(car.year)
//    println(car.brand)
//    println(car.color)
//    println(car.weight)
//    println("additionalFeatures:")
//
//    car.additionalFeatures.forEachIndexed { index, feat ->
//        println("Lap: ${index + 1}")
//        feat.forEachIndexed { subIndex, subFeat ->
//            println( "SubLap: ${subIndex + 1}")
//            println("Feature: ${subFeat.name}, ${if (subFeat.isNew) "Is Brand New" else "Old Feature"}, Year: ${subFeat.featureYear}")
//        }
//    }
//}
