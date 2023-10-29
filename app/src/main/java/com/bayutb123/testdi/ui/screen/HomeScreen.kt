package com.bayutb123.testdi.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val name = viewModel.nameUser.value
    Column {

        Button(onClick = { viewModel.updateName() }) {
            Text(text = "Update")
        }
        Text(text = name)
    }
}