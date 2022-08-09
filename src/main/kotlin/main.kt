fun main(){

    // Helden initiieren

    var blademaster = Blademaster()
    var hunter = Hunter()
    var priestess = Priestess()

    var groupOfHeroes = listOf(blademaster, hunter, priestess)              // Dies soll auch die Spielreihenfolge sein

    // Beutel der Heldengruppe: kann einmalig pro Runde
    var usePorch = Boolean


    // Gegner initiieren

    var chieftain = Chieftain()
    var chieftainsLittleHelper = ChieftainsLittleHelper()

    var groupOfEnemies = listOf(chieftain, chieftainsLittleHelper)

    // Spiel
    var gameOver = false


    println("Golden Syntax")
    println("Willkommen zu den Widelands! \nDem Ort, an dem entschieden wird, ob Menschen oder Orcs das Land beherrschen werden!")
    println("Du wirst in die Rolle der Menschen schlüpfen und versuchen den Chieftain der Orcs zu schlagen.\n" +
            "Der Chieftain ist sich siegessicher, deshalb lässt er dir den Vortritt.")
    println("Lucius darf als erster angreifen, danach ist Quirin an der Reihe und zu guter Letzt Fabiola.")
    println("Danach kommt der Chieftain dran.\nDies Wiederholt sich solange, bis alle Helden außer gefecht sind oder der Chieftain und sein Helferlein das Handtuch werfen.")
}


    /*
        while ((blademaster.hp() > 0 ||hunter.hp() > 0 || priestress.hp() > 0) &&
                (bigEnemy.hp() > 0 || smallEnemy.hp() > 0)) {

                hier sollen jetzt die Helden der Reihe nach mit der
                vom Spieler ausgesuchten Aktion gegen Orc agieren

                heroes
     */