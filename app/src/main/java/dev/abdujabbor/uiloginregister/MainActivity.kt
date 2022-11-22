package dev.abdujabbor.uiloginregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var frombottom:Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bgApp.animate().translationY(-1000F).setDuration(1800).setStartDelay(300)
        cloverimg.animate().alpha(0F).setDuration(1800).setStartDelay(600)
        splashtext.animate().translationY(140f).alpha(0f).setDuration(1800).setStartDelay(300)

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom)
        menus.startAnimation(frombottom)

        hometxt.startAnimation(frombottom)

    }
}