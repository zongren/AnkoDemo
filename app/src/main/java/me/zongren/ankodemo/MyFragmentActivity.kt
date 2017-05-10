package me.zongren.ankodemo

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.frameLayout
import org.jetbrains.anko.support.v4.withArguments
import org.jetbrains.anko.verticalLayout

/**
 * Created by zongren on 2017/5/9.
 */
class MyFragmentActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ID = 1;
        verticalLayout{
            frameLayout{
                id = ID
            }
        }
        supportFragmentManager.beginTransaction().add(ID,MyFragment()).commitAllowingStateLoss()
    }
}