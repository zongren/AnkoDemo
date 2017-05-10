package me.zongren.ankodemo
import android.app.Activity
import android.support.v4.app.Fragment
import org.jetbrains.anko.*

class Component<T>:AnkoComponent<T>{
    override fun createView(ui: AnkoContext<T>) = with(ui){
        verticalLayout{
            button("back"){
                onClick{
                    if(ui.owner is Activity) {
                        val activity = ui.owner as Activity
                        activity.finish()
                    }
                    else if(ui.owner is Fragment)  {
                        val fragment = ui.owner as Fragment
                        fragment.activity.finish()
                    }
                }
            }.lparams{
                width = matchParent
            }
        }
    }

}