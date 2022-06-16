package rocketmission.simulator

import rocketmission.assets.Rocket
import rocketmission.assets.Supplies

class SimulatorImplementation(
    val suppliesList: List<Supplies>,
    val rocketList: List<Rocket>,
): Simulator{
    var supplies = suppliesList.toMutableList()
    var rockets = rocketList.toMutableList()
    override fun executeSimulation() {
        loadRockets()
    }
    private fun loadRockets(){
        rockets.forEach{rocket ->
            val load = rocket.maxLoad
            var sum = 0.0
            supplies.forEach {supply ->
                if (load - sum > (supply.weight * supply.quantity)){
                    rocket.container.add(supply)
                    sum += (supply.weight * supply.quantity)
                    supplies = supplies.filter { it.name != supply.name } as MutableList<Supplies>
                }
            }
        }
        launch()
    }
    private fun launch(){
        rockets.forEach { rocket ->
            val random = (1..100).random()
            val probability = rocket.crashChance.times(100)
            if (random <= probability){
                println ("${rocket.name}Rocket: Crash On TakeOff")
            }else {
                println ("${rocket.name}Rocket: Launch On TakeOff")
                val randomLand = (1..100).random()
                if (randomLand <= probability){
                    println("${rocket.name}Rocket: Crash On Land")
                }
                else{
                    println("${rocket.name} Rocket Landed on Mars and delivered ${rocket.container.size} Items")
                }
            }
        }
    }
}