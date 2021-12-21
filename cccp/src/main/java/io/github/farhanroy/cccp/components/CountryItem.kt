package io.github.farhanroy.cccp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.farhanroy.cccp.data.CCPCountry
import io.github.farhanroy.cccp.data.getFlagEmojiByCountryNameCode

@Composable
fun CountryItem(countryText: CCPCountry, onItemClick: (CCPCountry) -> Unit) {
    Row(
        modifier = Modifier
            .clickable(onClick = { onItemClick(countryText) })
            .height(57.dp)
            .fillMaxWidth()
            .padding(PaddingValues(8.dp, 16.dp))
    ) {
        Text(text = countryText.flagEmoji, fontSize = 18.sp)
        Text(
            modifier = Modifier
                .padding(start = 12.dp),
            text = "${countryText.name} (+${countryText.phoneCode})",
            fontSize = 18.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCountryItem() {
    CountryItem(
        CCPCountry(),
        onItemClick = {})
}