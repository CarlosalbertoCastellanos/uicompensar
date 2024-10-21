package com.compensar.uicompensar.ui.product

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListProductsViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Productos"
    }
    val text: LiveData<String> = _text
}