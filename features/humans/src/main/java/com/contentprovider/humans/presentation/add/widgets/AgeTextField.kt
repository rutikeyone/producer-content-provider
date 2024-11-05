package com.contentprovider.humans.presentation.add.widgets

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.contentprovider.humans.R

@Composable
fun AgeTextField(
    ageState: State<String>,
    onValueChanged: (String) -> Unit,
) {
    TextField(
        modifier = Modifier
            .width(240.dp)
            .padding(top = 16.dp),
        value = ageState.value,
        onValueChange = onValueChanged,
        label = {
            Text(stringResource(R.string.age))
        },
        singleLine = true,
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Done,
        ),
    )
}