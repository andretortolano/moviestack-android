package moviestack.core.helper

import android.content.Context
import android.content.Intent

object NavigationHelper {

    fun getHomeIntent(context: Context) =
        internalIntent(context, "moviestack.feature.home.action.OPEN")

    private fun internalIntent(context: Context, action: String) =
        Intent(action).setPackage(context.packageName)
}