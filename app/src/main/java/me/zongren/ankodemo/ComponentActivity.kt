package me.zongren.ankodemo

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import org.jetbrains.anko.applyRecursively
import org.jetbrains.anko.setContentView

/**
 * Created by zongren on 2017/5/9.
 */
class ComponentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Component<Activity>().setContentView(this).applyRecursively {
            view -> when(view){
                is Button -> view.text = "back from activty"
            }
        }
    }
}

