import rocketmission.assets.Rocket
import rocketmission.assets.Supplies
import rocketmission.simulator.SimulatorImplementation
lateinit var simulator: SimulatorImplementation
fun main() {
    simulator = SimulatorImplementation(rocketList = rocketList1, suppliesList = supplyList)
    simulator.executeSimulation()

}

val rocketList1: List<Rocket> = listOf(
    Rocket(name = "Coete 1", maxLoad = 15.0, crashChance = 0.0),
    Rocket(name = "Coete 2", maxLoad = 18.0, crashChance = 0.0),
    Rocket(name = "Coete 3", maxLoad = 55.0, crashChance = 0.0)
)

val supplyList: List<Supplies> = listOf(
    Supplies(name = "Water", weight = 1.0, quantity = 4),
    Supplies(name = "Food", weight = 1.0, quantity = 13),
    Supplies(name = "Oxygen", weight = 1.3, quantity = 5),
    Supplies(name = "Seeds", weight = 0.73, quantity = 3),
    Supplies(name = "earth", weight = 2.0, quantity = 6),
    Supplies(name = "animals", weight = 1.0, quantity = 2),
    Supplies(name = "minerals", weight = 1.3, quantity = 2),
    Supplies(name = "tech", weight = 0.73, quantity = 1),
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
