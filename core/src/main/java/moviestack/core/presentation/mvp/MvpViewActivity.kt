package moviestack.core.presentation.mvp

import androidx.appcompat.app.AppCompatActivity

abstract class MvpViewActivity: AppCompatActivity(), MvpView {

    // Stuff for Parent View Activity

    override fun showToastError(error: String) {
        // TODO
    }
}