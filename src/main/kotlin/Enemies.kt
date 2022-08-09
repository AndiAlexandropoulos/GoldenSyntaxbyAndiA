
                        // Vererbende Klasse Feinde

open class Enemies {

    val name: String
    var hp: Double

    constructor(name: String, hp: Double) {
        this.name = name
        this.hp = hp
    }

                        // Mini-Me
    // var summonHelper


                        // Angriff
    open fun attack(enemies: Enemies) : Enemies{
        return enemies
    }

    // Ausweichen, Blocken

    //  alle sollen eine 10% Chance auf blocken ( 50% des Schadens) haben
    //  und eine 10% Chance auf Ausweichen haben

    open fun dodge(): Boolean {
        return false
    }

    open fun block(): Double {
        return 1.0
    }
}