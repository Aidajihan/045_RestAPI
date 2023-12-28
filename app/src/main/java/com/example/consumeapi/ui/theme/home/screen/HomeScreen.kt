package com.example.consumeapi.ui.theme.home.screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.consumeapi.model.Kontak

@Composable
fun KontakCard(
    kontak: Kontak
    onDeleteClick: (Kontak) -> Unit = {},
    modifier: Modifier = Modifier
){
    Row (
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = kontak.email,
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(Modifier.weight(1f))
        IconButton(onClick = { onDeleteClick(kontak) }) {
            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = null,
            )
        }
    }
}