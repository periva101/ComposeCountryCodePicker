package io.github.farhanroy.cccp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import io.github.farhanroy.cccp.components.CountryCodeDialog
import io.github.farhanroy.cccp.data.CCPCountry
import io.github.farhanroy.cccp.state.DialogStateViewModel
import io.github.farhanroy.cccp.state.changeIsOpen

@Composable
fun CountryCodeField(
    modifier: Modifier = Modifier,
    dialogStateViewModel: DialogStateViewModel = DialogStateViewModel(),
    pickedCountry: (CCPCountry) -> Unit
) {
    val textState = remember { mutableStateOf(TextFieldValue("")) }

    pickedCountry(dialogStateViewModel.uiState.CPCountry)

    MaterialTheme {
        Column(modifier = modifier) {

            Row(
                Modifier.clickable {
                    dialogStateViewModel.uiState = dialogStateViewModel.uiState.changeIsOpen(true)
                },
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(dialogStateViewModel.uiState.CPCountry.flagEmoji)

                Text(
                    modifier = Modifier.padding(start = 3.dp),
                    text = "(${dialogStateViewModel.uiState.CPCountry.nameCode.uppercase()})"
                )

                Text(
                    modifier = Modifier.padding(start = 3.dp),
                    text = "+" + dialogStateViewModel.uiState.CPCountry.phoneCode
                )

                Icon(
                    modifier = Modifier.padding(start = 3.dp),
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null
                )
            }

            CountryCodeDialog(state = textState)
        }
    }
}

@Composable
fun CountryCodeFieldX2(
    modifier: Modifier = Modifier,
    dialogStateViewModel: DialogStateViewModel = DialogStateViewModel(),
    pickedCountry: (CCPCountry) -> Unit
) {
    val textState = remember { mutableStateOf(TextFieldValue("")) }

    pickedCountry(dialogStateViewModel.uiState.CPCountry)

    MaterialTheme {
        Column(modifier = modifier) {

            Row(
                Modifier.clickable {
                    dialogStateViewModel.uiState = dialogStateViewModel.uiState.changeIsOpen(true)
                },
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(dialogStateViewModel.uiState.CPCountry.flagEmoji)

                Text(
                    modifier = Modifier.padding(start = 3.dp),
                    text = "(${dialogStateViewModel.uiState.CPCountry.nameCode.uppercase()})"
                )

                TextField(value = textState.value, onValueChange = { textState.value = it })

            }

            CountryCodeDialog(state = textState)
        }
    }
}