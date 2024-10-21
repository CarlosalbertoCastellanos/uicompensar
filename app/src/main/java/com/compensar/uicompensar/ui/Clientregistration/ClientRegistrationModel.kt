package com.compensar.uicompensar.ui.Clientregistration

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ClientRegistrationModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Registro de clientes"
    }
    val text: LiveData<String> = _text
}