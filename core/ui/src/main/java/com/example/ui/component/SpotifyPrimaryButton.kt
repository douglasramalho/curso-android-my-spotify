package com.example.ui.component

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SpotifyPrimaryButton(
    title: String,
    onClick: () -> Unit
) {
    Button(
        onClick = { onClick.invoke() },
        modifier = Modifier.height(50.dp)
    ) {
        Text(text = title)
    }
}