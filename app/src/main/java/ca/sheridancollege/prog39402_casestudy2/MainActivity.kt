package ca.sheridancollege.prog39402_casestudy2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ca.sheridancollege.prog39402_casestudy2.model.Person

class MainActivity : AppCompatActivity(), PersonListFragment.OnListFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
                .beginTransaction()
                .add(R.id.flFragmentMaster, PersonListFragment.newInstance(), PersonListFragment.TAG)
                .add(R.id.flFragmentDetail, PersonDetailFragment.newInstance(), PersonDetailFragment.TAG)
                .commit()
    }


    override fun onListFragmentInteraction(item: Person) {
        val detail = (supportFragmentManager.findFragmentByTag(PersonDetailFragment.TAG) ?: return) as PersonDetailFragment
        detail.updateData(item)
    }

}
