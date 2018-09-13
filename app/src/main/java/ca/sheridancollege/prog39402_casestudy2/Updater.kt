package ca.sheridancollege.prog39402_casestudy2

import ca.sheridancollege.prog39402_casestudy2.model.Person

interface Updater {
    fun updateData(item: Person)
}