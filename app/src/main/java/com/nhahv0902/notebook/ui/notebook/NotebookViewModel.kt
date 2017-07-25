package com.nhahv0902.notebook.ui.notebook

import android.databinding.Bindable
import com.nhahv0902.notebook.BR
import com.nhahv0902.notebook.R
import com.nhahv0902.notebook.data.Notebook
import com.nhahv0902.notebook.ui.BaseAdapter
import com.nhahv0902.notebook.ui.BaseViewModel


/**
 * Exposes the data to be used in the Notebook screen.
 */

class NotebookViewModel : BaseViewModel() {

    @get: Bindable
    var isLoading: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.loading)
        }


    @get: Bindable
    var adapter: BaseAdapter<Notebook>? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.adapter)
        }

    init {
        var array: ArrayList<Notebook> = ArrayList()
        array.add(Notebook("Hoang Van Nha"))
        array.add(Notebook("Hoang Van Tung"))
        array.add(Notebook("Hoang Van Truong"))

        adapter = BaseAdapter<Notebook>(this, array, R.layout.item_view_holder)
    }
}
