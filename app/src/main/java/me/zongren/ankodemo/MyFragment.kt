package me.zongren.ankodemo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import org.jetbrains.anko.*

/**
 * Created by zongren on 2017/5/9.
 */
class MyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? = Component<Fragment>().createView(AnkoContext.Companion.create(activity,this)).applyRecursively {
        view->when(view){
            is Button -> view.text = "back from fragment"
        }
    }
}
