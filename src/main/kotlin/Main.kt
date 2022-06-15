fun main(args: Array<String>) {
    execute(carTwo)
}

fun execute(car: MyFirstCarClass) {
    println(car.year)
    println(car.brand)
    println(car.color)
    println(car.weight)
    println("additionalFeatures:")
    for (elm in car.additionalFeatures) {
        println("Feature: ${elm.name}, ${if(elm.isNew)"Is Brand New" else "Old Feature"}, Year: ${elm.featureYear}")
    }
}

data class MyFirstCarClass(
    val year: Int,
    val brand: String,
    val color: String,
    val weight: Double,
    val additionalFeatures: List<Feature>,
)

data class Feature(
    val isNew: Boolean,
    val name: String,
    val featureYear: Int,
)

val carOne: MyFirstCarClass = MyFirstCarClass(
    year = 2018,
    brand = "Porsche",
    color = "Blue",
    weight = 3.07,
    additionalFeatures = listOf(Feature(isNew = true, name = "New Rings", featureYear = 2018),Feature(isNew = false, name = "Electric Windows", featureYear = 2014))
)

val carTwo: MyFirstCarClass = MyFirstCarClass(
    year = 2021,
    brand = "Ferrari",
    color = "Red",
    weight = 2.9,
    additionalFeatures = listOf(Feature(isNew = true, name = "New Rings", featureYear = 2021),Feature(isNew = false, name = "Electric Windows", featureYear = 2013))
)