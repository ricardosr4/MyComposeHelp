package com.example.mycompose.ui.component.text

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.mycompose.R

@Preview(showBackground = true)
@Composable
fun TextExample() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center


    ){
        Text(
            text = stringResource(id = R.string.name), //Texto que se mostrara
            color = Color.Blue,  //Determina el color de la letra
            fontSize = 40.sp,  //Determina el tamaño de la letra
            fontStyle = FontStyle.Italic, //Determina la tipografia
            fontWeight = FontWeight.W600,  //Determina el grosor de la letra
            fontFamily = FontFamily.Serif, //Determina la fuente de la letra
            letterSpacing = 5.sp, //Determina el espaciado entre las letras
            textDecoration = TextDecoration.Underline, //Determina la linea de subrayado
            textAlign = TextAlign.Right,  //Determina la alineacion del texto
            maxLines = 1, //Determina el numero maximo de lineas que puede tener el texto
            style = MaterialTheme.typography.bodyLarge.copy(
                shadow = Shadow(
                    offset = Offset(7f, 7f),  //esto es para determinar la posicion del sombreado
                    blurRadius = 1f, //esto es para determinar el tamaño del sombreado
                    color = Color.Black.copy(alpha = 0.5f) //esto es para determinar el color del sombreado

                )
            )





        )
    }

}