fun main(args: Array<String>) {
    GameModel.resetGame()   //singleton
    GamePresenter.onDeskTap() // singleton luon vi chi co 1
    //GameModel.debugPrint()

    val numBackUpPairsByRegion = mapOf("Africa" to 4, "Antarctica" to 7, "Asia" to 3, "Australia" to 2, "Europe" to 2, "North America" to 3, "South America" to 4)
    val region = "Antarctica"
    val area = 14000000
    val numPantsPerPanda = 1 + numBackUpPairsByRegion[region] as Int
    val howManyPants = fun(numPandas: Int) = numPandas + numPantsPerPanda
    fun countPandas(area: Int) : Int = if (area > 3000) area / 25 else area / 18
    val pantsCounter = object {
        fun count(numPandas: Int, convertPandasToPants: (Int) -> Int): Int = convertPandasToPants.invoke(numPandas)
    }
    println(pantsCounter.count(countPandas(area), howManyPants))
}