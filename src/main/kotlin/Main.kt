const val HERO_NAME = "Madrigal"
    fun main() {
        println("The hero announces her presence to the world.")

        println(HERO_NAME)
        var playerLevel = 4 // assigned an instance of the type Int to a variable called playerLevel
        println(playerLevel)


        val hasBefriendedBarbarians = true
        val hasAngeredBarbarians = false
        val playerClass = "paladin"
        val quest: String = if (playerLevel == 1) {
           "Meet Mr. Bubbles in the land of soft things."
        } else if (playerLevel in 2..5) {
            //Check whether diplomacy is an option
            val canTalkToBarbarians = !hasAngeredBarbarians &&
                    (hasBefriendedBarbarians || playerClass == "barbarian")
            if (canTalkToBarbarians) {
                "Convince the barbarians to call off their invasion."
            } else {
                "Save the town from the barbarian invasions."
            }
        } else if (playerLevel == 6) {
            "Locate the enchanted sword."
        } else if (playerLevel == 7) {
            "Recover the long-lost artifact of creation."
        } else if (playerLevel == 8) {
            "Defeat Nogartse, bringer of death and eater of worlds."
        } else {
            "There are no quests right now."
        }
        println("The hero approaches the bounty board. It reads:")
        println(quest)

        println("Time passes...")
        println("The hero returns from her quest.")

        playerLevel += 1
        println(playerLevel)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
}