object GamePresenter {
    var view: GameView? = null
    fun setGameView(gameView: GameView) {
        view = gameView
    }

    fun onDeskTap() {
        GameModel.onDeskTap()
        view?.update()
    }

    fun onWasteTap() {
        GameModel.onWasteTap()
        view?.update()
    }

    fun onFoundationTap(foundationIndex: Int) {
        GameModel.onFoundationTap(foundationIndex)
        view?.update()
    }

    fun onTableauTap(tableauIndex: Int, cardIndex: Int) {
        GameModel.onTableauTap(tableauIndex, cardIndex)
        view?.update()
    }

}