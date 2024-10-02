package com.example.mycompose.ui.component.componentscontrol

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun MySwitch() {
    var state by rememberSaveable {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Switch(
            checked = state,
            onCheckedChange = { state = !state },
            enabled = true,
            colors = SwitchDefaults.colors(
                uncheckedThumbColor = Color.Red,
                checkedThumbColor = Color.Green,
                uncheckedTrackColor = Color.Blue,
                checkedTrackColor = Color.Yellow,
                uncheckedBorderColor = Color.Black,
                checkedBorderColor = Color.Black
            ),
            modifier = Modifier
                .align(Alignment.Center)

        )
    }
}


