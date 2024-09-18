package com.example.mycompose.ui.component.box

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun BoxExample(){

    Box(
        modifier = Modifier
            .background(Color.White)
        .fillMaxSize(),
        contentAlignment = Alignment.Center




    ){
        Greeting( "Richard")
        Greeting(name = "Developer", modifier = Modifier.align(Alignment.BottomCenter))

    }
}
@Composable
fun Greeting(name: String,modifier: Modifier = Modifier) {
    Text(text = "Hello $name!", modifier = modifier)

}