
                        // Vererbende Klasse Helden

open class Heroes {

    private val name: String
    private var hp: Double

    constructor(name: String, hp: Double){
        this.name = name
        this.hp = hp
    }

                        // Beutel inklusive Inhalt

    private val elixir = Double
    private val vitamins = Double

    // Beutel der Heldengruppe: kann einmalig pro Runde
    var usePouch = Int
    var pouch = mutableListOf(elixir, vitamins)

                        // Methode Angriff

    open fun attack(heroes: Heroes) :Heroes{
        return heroes
    }


                        // Held benutzt Beutel:

    fun usePouch(){
       // this.pouch -= 1
    }
                        // Ausweichen, Blocken

    open fun dodge(): Boolean {
        return false
    }

    open fun block(): Double {
        return 1.0
    }


}