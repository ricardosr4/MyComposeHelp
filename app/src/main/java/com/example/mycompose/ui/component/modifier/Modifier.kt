package com.example.mycompose.ui.component.modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ModifierExample(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("Hello Richard",
            modifier = Modifier
                .clickable {  }
                .background(Color.Cyan)
                .border(2.dp, Color.Black)  //si el orden del borde se cambia de linea cambia todoo
                .padding(horizontal = 16.dp, vertical = 8.dp)
                //aqui un ejemplo de un modificador personalizado cambiando el orden del codigo
                .background(Color.Yellow)
                .border(2.dp, Color.Red)  //si el orden del borde se cambia de linea cambia todoo
                .padding(horizontal = 16.dp, vertical = 8.dp)


        )

    }
}
