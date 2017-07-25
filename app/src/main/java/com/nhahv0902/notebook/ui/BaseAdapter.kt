package com.nhahv0902.notebook.ui

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.databinding.library.baseAdapters.BR

/**
 * Created by nhahv0902 on 7/31/17.
 * BaseAdapter for recycler view
 */

class BaseAdapter<T>(val viewModel: BaseViewModel, val collection: ArrayList<T>, val resLayout: Int)
    : RecyclerView.Adapter<BaseAdapter.BaseViewHolder<ViewDataBinding, T>>() {

    private var mInflater: LayoutInflater? = null

    override fun onBindViewHolder(holder: BaseViewHolder<ViewDataBinding, T>?, position: Int) {
        holder?.bind(collection[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder<ViewDataBinding, T> {
        if (mInflater == null) mInflater = LayoutInflater.from(parent?.context)
        val binding: ViewDataBinding = DataBindingUtil.inflate(mInflater!!, resLayout, parent, false)
        return BaseViewHolder(binding, viewModel)
    }

    override fun getItemCount(): Int = collection.size

    class BaseViewHolder<out T : ViewDataBinding, in E>(val binding: T, val viewModel: BaseViewModel)
        : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: E) {
            binding.setVariable(BR.item, item)
            binding.setVariable(BR.viewModel, viewModel)
            binding.executePendingBindings()
        }
    }
}
