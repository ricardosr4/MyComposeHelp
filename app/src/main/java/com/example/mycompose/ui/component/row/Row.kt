package com.example.mycompose.ui.component.row

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun RowExample(){
    Row(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        horizontalArrangement = Arrangement.SpaceEvenly,  //modifica posicion horizontal
        verticalAlignment = Alignment.CenterVertically   //modifica posicion vertical


    )

    {
        Greeting("Richard", modifier = Modifier
            .background(Color.Red)
        )
        Greeting("Developer", modifier = Modifier
            .background(Color.Cyan)
        )
        Greeting("Developer", modifier = Modifier
            .background(Color.Yellow)
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(text = "Hello $name!", modifier = modifier)

}

