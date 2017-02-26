package davydoff.mskm.youplan.presenter

import davydoff.mskm.youplan.view.View

/**
 * Created by mskm on 19.02.2017.
 */

abstract class Presenter<V : View> {

    var mView: V? = null
        private set

    fun addView(view: V) {
        mView = view
    }

    fun removeView(view: V) {
        if (mView == view) {
            mView = null
        }
    }





    
}
