class Blademaster() :Heroes("Lucius", 750.0) {
/*
    override fun attack(enemies: Enemies) : Enemies {
        enemies.hp()(enemies.hp() - (25 * enemies.block()))
        return enemies
    }










/*      Der Blademaster ist dran, du hast die Wahl, ob du

        1 mit dem Wirbelangriff
        2 mit dem Blitzschwert
        3 mit dem Schildschlag
        4 mit dem Schnellstich

        angreifen möchtest.


 */

// Ausweichchance 10 %

override fun dodge():Boolean {
    var dodge = false
    if((0..99).random() < 10)
        dodge = true
    return dodge
}
// Blockt Schaden 50 %

override fun block():Double {
    return 0.5
}


 */

}