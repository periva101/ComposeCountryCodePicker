package io.github.farhanroy.cccp.state

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import io.github.farhanroy.cccp.data.CCPCountry

data class DialogUiState(val isOpen: Boolean = false, val CPCountry: CCPCountry = CCPCountry())
class DialogStateViewModel : ViewModel() {

    var uiState by mutableStateOf(DialogUiState())

}

fun DialogUiState.changeIsOpen(isOpen: Boolean) = this.copy(isOpen = isOpen)
fun DialogUiState.changeCPCountry( CPCountry: CCPCountry ) = this.copy(CPCountry = CPCountry)