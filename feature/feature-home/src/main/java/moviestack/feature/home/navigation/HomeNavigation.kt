package moviestack.feature.home.navigation

import android.content.Context
import moviestack.core.presentation.navigation.AndroidNavigation

object HomeNavigation: AndroidNavigation() {
    override fun navigate(context: Context) {
        startInternalActivity(context, "moviestack.feature.home.action.OPEN")
    }
}