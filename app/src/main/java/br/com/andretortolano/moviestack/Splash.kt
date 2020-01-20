package br.com.andretortolano.moviestack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import moviestack.core.helper.NavigationHelper

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(NavigationHelper.getHomeIntent(this))
    }
}
