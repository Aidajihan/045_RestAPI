package com.example.consumeapi.ui.theme.home.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.consumeapi.ui.theme.kontak.viewmodel.InsertUiEvent

@Composable
fun FormInputSiswa(
    insertUiEvent: InsertUiEvent,
    modifier: Modifier = Modifier,
    onValueChange: (InsertUiEvent) -> Unit = {},
    enabled: Boolean = true
){
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        OutlinedTextField(
          value = insertUiEvent.nama ,
          onValueChange = {onValueChange(insertUiEvent.copy(nama = it))},
          label = { Text("Nama")},
          modifier = Modifier.fillMaxWidth(),
          enabled = enabled,
          singleLine = true
        )
        OutlinedTextField(
            value = insertUiEvent.email ,
            onValueChange = {onValueChange(insertUiEvent.copy(email = it))},
            label = { Text("Email")},
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            singleLine = true
        )
        OutlinedTextField(
            value = insertUiEvent.nohp ,
            onValueChange = {onValueChange(insertUiEvent.copy(nohp =  it))},
            label = { Text("No HP")},
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            singleLine = true
        )
        if (enabled){
            Text(
                text = "Isi Semua data",
                modifier = Modifier.padding(start = 12.dp)
            )
        }
        Divider(
            thickness = 8.dp,
            modifier = Modifier.padding(12.dp)
        )
    }
}