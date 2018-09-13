package ca.sheridancollege.prog39402_casestudy2.model

import ca.sheridancollege.prog39402_casestudy2.R

class DataProvider {
    companion object {

        fun allPeople(): List<Person> {
            return listOf(
                    Person("Jack Sparrow", R.drawable.sparrow, "https://en.wikipedia.org/wiki/sparrow"),
                    Person("Hector barbossa", R.drawable.barbossa, "https://en.wikipedia.org/wiki/Hector_Barbossa"),
                    Person("Elizabeth Swann", R.drawable.swann, "https://en.wikipedia.org/wiki/Elizabeth_Swann"),
                    Person("Will Turner", R.drawable.turner, "https://en.wikipedia.org/wiki/turner")
            )
        }
    }
}