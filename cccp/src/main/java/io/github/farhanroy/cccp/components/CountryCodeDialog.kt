package io.github.farhanroy.cccp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.lifecycle.viewmodel.compose.viewModel
import io.github.farhanroy.cccp.data.getCountries
import io.github.farhanroy.cccp.state.DialogStateViewModel
import io.github.farhanroy.cccp.state.changeCPCountry
import io.github.farhanroy.cccp.state.changeIsOpen
import java.util.*

@Composable
fun CountryCodeDialog(
    state: MutableState<TextFieldValue>,
    viewModel: DialogStateViewModel = viewModel(),
) {
    if (viewModel.uiState.isOpen) {
        val searchedText = state.value.text
        val countries = if (searchedText.isNotBlank())
            getCountries().filter { it.name.contains(searchedText, true) }
        else
            getCountries()

        Dialog(onDismissRequest = { viewModel.uiState=viewModel.uiState.changeIsOpen(false) }) {
            Box(
                Modifier
                    .size(480.dp, 480.dp)
                    .background(Color.White)
            ) {
                LazyColumn(Modifier.padding(8.dp)) {

                    item {
                        SearchView(state = state)
                    }
                    items(countries.size) { index ->
                        CountryItem(
                            countryText = countries[index],
                            onItemClick = { selectedCountry ->
                              viewModel.uiState=  viewModel.uiState.changeIsOpen(false)
                              viewModel.uiState=  viewModel.uiState.changeCPCountry(selectedCountry)
                            }
                        )
                    }
                }
            }

        }
    }
}
