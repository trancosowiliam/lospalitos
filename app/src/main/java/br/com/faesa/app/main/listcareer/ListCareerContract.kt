package br.com.faesa.app.main.listcareer

import br.com.faesa.app.BasePresenter
import br.com.faesa.app.BaseView
import br.com.faesa.app.data.model.CareerSimple

/**
 * Created by wiliam on 5/22/18.
 */
interface ListCareerContract {
    interface Presenter : BasePresenter<View> {
        fun loadList()
    }

    interface View : BaseView<Presenter> {
        fun showLoadDialog()
        fun dismissLoadDialog()
        fun loadList(list: List<CareerSimple>)
    }
}