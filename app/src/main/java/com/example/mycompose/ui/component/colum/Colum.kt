package com.example.mycompose.ui.component.colum

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview  // Anotación que permite previsualizar la función en Android Studio
@Composable
fun ColumExample() {
    // Column es un contenedor que coloca sus hijos uno encima del otro (verticalmente)
    Column(
        modifier = Modifier  // Modificador que ocupa todoo el espacio disponible (fillMaxSize) y establece el fondo en blanco (background)
        .fillMaxSize()  // Ocupa el máximo tamaño disponible en la pantalla
        .background(Color.White),  // Establece el fondo del Column en color blanco
        verticalArrangement = Arrangement.SpaceAround, // Coloca los elementos verticalmente, dejando espacio entre ellos
        horizontalAlignment = Alignment.CenterHorizontally    // Centra horizontalmente los elementos dentro de la columna


    )

    {
        // Llama a la función composable Greeting con el nombre "Richard" y un fondo rojo
        Greeting("Richard", // Nombre que se mostrará en el texto
            modifier = Modifier
            .background(Color.Red) // Aplica un fondo rojo al texto
            )
        Greeting("Developer",
            modifier = Modifier
            .background(Color.Cyan)
            )
        Greeting("Developer",
            modifier = Modifier
            .background(Color.Yellow)
            )
    }
}
// Función composable que muestra un texto "Hello <name>!"
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(text = "Hello $name!", modifier = modifier)

}