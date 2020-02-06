package moviestack.core.presentation.mvp

interface MvpPresenter<V: MvpView> {
    fun start(view: V)
}