package ca.sheridancollege.prog39402_casestudy2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ca.sheridancollege.prog39402_casestudy2.R
import ca.sheridancollege.prog39402_casestudy2.model.Person
import kotlinx.android.synthetic.main.fragment_person.view.*

class MyPersonRecyclerViewAdapter(
        private val mValues: List<Person>,
        private val mListener: ListItemClickListener<Person>)
    : RecyclerView.Adapter<MyPersonRecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_person, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        holder.mContentView.text = item.name
        with(holder.mView) {
            setOnClickListener { mListener.onClick(item) }
        }
    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mContentView: TextView = mView.content
        override fun toString(): String {
            return super.toString() + " '" + mContentView.text + "'"
        }
    }
}
