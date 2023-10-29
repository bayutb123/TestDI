package com.bayutb123.testdi.ui.screen

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bayutb123.testdi.domain.usecase.UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val useCase: UseCase
) : ViewModel() {
    private val _nameUser = mutableStateOf("")
    val nameUser = _nameUser

    fun updateName() {
        viewModelScope.launch {
            _nameUser.value =  useCase.getName()
        }
    }
}