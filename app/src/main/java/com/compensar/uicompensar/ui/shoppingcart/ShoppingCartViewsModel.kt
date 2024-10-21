package com.compensar.uicompensar.ui.shoppingcart

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoppingCartViewsModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Carro compras"
    }
    val text: LiveData<String> = _text
}