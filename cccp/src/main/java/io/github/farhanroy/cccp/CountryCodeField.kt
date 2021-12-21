package io.github.farhanroy.cccp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import io.github.farhanroy.cccp.components.CountryCodeDialog
import io.github.farhanroy.cccp.components.SearchView
import io.github.farhanroy.cccp.data.CCPCountry
import io.github.farhanroy.cccp.data.getCountries
import io.github.farhanroy.cccp.state.DialogStateViewModel
import io.github.farhanroy.cccp.state.changeCPCountry
import io.github.farhanroy.cccp.state.changeIsOpen

@Composable
@Preview
fun CountryCodeField(
    modifier: Modifier = Modifier,
    dialogStateViewModel: DialogStateViewModel = viewModel(),
    pickedCountry: (CCPCountry) -> Unit = { }
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
@Preview
fun CountryCodeFieldX2(
    modifier: Modifier = Modifier,
    dialogStateViewModel: DialogStateViewModel = viewModel(),
    pickedCountry: (CCPCountry) -> Unit = {}
) {
    val textState = remember { mutableStateOf(TextFieldValue("")) }
    var phoneNumber by remember { mutableStateOf("") }

    pickedCountry(dialogStateViewModel.uiState.CPCountry)

    MaterialTheme {
        Column(modifier = modifier) {

            Row(
                Modifier.clickable {
                    dialogStateViewModel.uiState = dialogStateViewModel.uiState.changeIsOpen(true)
                },
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    modifier = Modifier.padding(start = 3.dp),
                    text = dialogStateViewModel.uiState.CPCountry.flagEmoji +"+"
                )

                TextField(
                    value = "+$phoneNumber",
                    placeholder = { Text(text = "Phone number") },
                    onValueChange = { value ->
                        phoneNumber = value.drop(1)
                        dialogStateViewModel.uiState =
                            dialogStateViewModel.uiState.changeCPCountry(getCountries().firstOrNull() {
                                it.phoneCode == value.drop(1)
                            } ?: CCPCountry())

                    },
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color.Black,
                        cursorColor = Color.Black,
                        leadingIconColor = Color.Black,
                        trailingIconColor = Color.Black,
                        backgroundColor = Color.White,
                        focusedIndicatorColor = Color.Red,
                        unfocusedIndicatorColor = Color.Black,
                        disabledIndicatorColor = Color.Transparent
                    )
                )


            }

            CountryCodeDialog(state = textState)
        }
    }
}