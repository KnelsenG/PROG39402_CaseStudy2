package ca.sheridancollege.prog39402_casestudy2.adapters

interface ListItemClickListener<in T> {
    fun onClick(item: T)
}