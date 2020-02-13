package br.com.andretortolano.moviestack.ui

import android.app.Activity
import android.os.Bundle
import moviestack.feature.home.navigation.HomeNavigation

class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        HomeNavigation.navigate(this)
    }
}
