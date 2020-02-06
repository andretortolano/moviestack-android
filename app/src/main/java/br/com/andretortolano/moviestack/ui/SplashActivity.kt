package br.com.andretortolano.moviestack.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import moviestack.feature.home.navigation.HomeNavigation

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        HomeNavigation.navigate(this)
    }
}
