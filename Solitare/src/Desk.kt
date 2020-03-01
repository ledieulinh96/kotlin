import java.util.*

class Desk {
    val cards: Array<Card> = Array(52, { Card(it % 13, getSuit(it))})
    var cardsInDesk: MutableList<Card> = cards.toMutableList()

    fun drawCard(): Card = cardsInDesk.removeAt(0)

    fun reset(){
        cardsInDesk = cards.toMutableList()
        cardsInDesk.forEach{ it.faceUp = false}
        Collections.shuffle(cardsInDesk)
    }

    private fun getSuit(i: Int) = when (i / 13) {
        0 -> clubs
        1 -> diamonds
        2 -> hearts
        else -> spades
    }
}