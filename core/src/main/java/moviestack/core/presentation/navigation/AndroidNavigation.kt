package moviestack.core.presentation.navigation

import android.content.Context
import android.content.Intent
import android.os.Bundle

abstract class AndroidNavigation {
    abstract fun navigate(context: Context)

    protected fun startInternalActivity(context: Context, action: String, bundle: Bundle? = null) {
        Intent(action).apply {
            setPackage(context.packageName)
            bundle?.let { putExtras(it) }
            context.startActivity(this)
        }
    }
}