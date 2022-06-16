package rocketmission.assets

data class Rocket (
    val name: String,
    val maxLoad: Double,
    val crashChance: Double,
    val container: MutableList<Supplies> = mutableListOf()
)
