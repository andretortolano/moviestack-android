package br.com.andretortolano.moviestack.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import moviestack.core.helper.NavigationHelper

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(NavigationHelper.getHomeIntent(this))
    }
}
