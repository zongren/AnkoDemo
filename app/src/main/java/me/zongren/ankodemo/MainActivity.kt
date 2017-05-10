package me.zongren.ankodemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout{
            button("ankoComponent"){
                onClick{
                    openAnkoComponentActivity()
                }
            }.lparams{
                width= matchParent
            }

            button("fragment"){
                onClick{
                    openFragmentActivity()
                }
            }.lparams{
                width= matchParent
                topMargin = dip(20)
            }

        }
    }

    private fun openAnkoComponentActivity() {
        startActivity(intentFor<ComponentActivity>())
    }

    private fun openFragmentActivity() {
        startActivity(intentFor<MyFragmentActivity>())
    }
}

