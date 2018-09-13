package ca.sheridancollege.prog39402_casestudy2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ca.sheridancollege.prog39402_casestudy2.adapters.ListItemClickListener
import ca.sheridancollege.prog39402_casestudy2.adapters.MyPersonRecyclerViewAdapter
import ca.sheridancollege.prog39402_casestudy2.model.DataProvider
import ca.sheridancollege.prog39402_casestudy2.model.Person

/**
 * A fragment representing a list of Items.
 * Activities containing this fragment MUST implement the
 * [PersonListFragment.OnListFragmentInteractionListener] interface.
 */
class PersonListFragment : Fragment(), ListItemClickListener<Person> {

    private var listener: OnListFragmentInteractionListener? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_person_list, container, false)

        if (view is RecyclerView) {
            with(view) {
                layoutManager = LinearLayoutManager(context)
                adapter = MyPersonRecyclerViewAdapter(DataProvider.allPeople(), this@PersonListFragment)
            }
        }
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnListFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnListFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface OnListFragmentInteractionListener {
        fun onListFragmentInteraction(item: Person)
    }

    override fun onClick(item: Person) {
        listener?.onListFragmentInteraction(item)
    }

    companion object {

        @JvmStatic
        fun newInstance() = PersonListFragment()

        const val TAG = "PersonListFragment"
    }
}
