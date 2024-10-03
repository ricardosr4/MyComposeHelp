package com.example.mycompose.ui.component.button

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White

@Composable
fun CustomButton() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(White),
        contentAlignment = Alignment.Center // Centra el contenido dentro del Box
    ) {
        Button(
            onClick = { /* Acción */ },
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent, // Usamos Color.Transparent ya que manejamos el fondo con Brush
                contentColor = White
            ),
            modifier = Modifier
                .padding(60.dp)
                .width(300.dp)
                .border(
                    width = 4.dp,
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFFB0BEC5), // Gris claro
                            Color(0xFF90A4AE), // Gris medio
                            Color(0xFFCFD8DC), // Plateado claro
                            Color(0xFF000000), // Gris más oscuro
                            Color(0xFF000000)  // Blanco/gris para reflejo
                        )
                    ),
                    shape = RoundedCornerShape(16.dp)
                )
                .align(Alignment.BottomCenter)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF0870C2),
                            Color(0xFF64B5F6)
                        ) // Efecto de brillo o degradado en el fondo
                    ),
                    shape = RoundedCornerShape(16.dp)
                )
        ) {
            Text(
                text = "Button",
                style = TextStyle(
                    fontSize = 20.sp,
                    shadow = Shadow(
                        color = Gray, // Sombra del texto
                        blurRadius = 3f
                    )
                ),
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
    }
}

@Preview
@Composable
fun PreviewCustomButton() {
    CustomButton()
}
