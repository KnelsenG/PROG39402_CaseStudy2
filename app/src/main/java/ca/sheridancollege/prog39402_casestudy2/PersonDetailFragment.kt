package ca.sheridancollege.prog39402_casestudy2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ca.sheridancollege.prog39402_casestudy2.model.Person
import kotlinx.android.synthetic.main.fragment_person_detail.*
import android.webkit.WebViewClient

class PersonDetailFragment : Fragment(), Updater {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_person_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        wvPerson.webViewClient = WebViewClient()
    }

    companion object {

        @JvmStatic
        fun newInstance() = PersonDetailFragment().apply { arguments = Bundle().apply {} }

        const val TAG = "PersonDetailFragment"
    }

    override fun updateData(item: Person) {
        tvName.text = item.name
        ivPerson.setImageResource(item.image)
        wvPerson.loadUrl(item.link)
    }
}
