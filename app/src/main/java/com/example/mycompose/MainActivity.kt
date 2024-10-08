package com.example.mycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycompose.ui.component.button.CustomButton
import com.example.mycompose.ui.component.componentscontrol.MySwitch
import com.example.mycompose.ui.component.modifier.ModifierExample
import com.example.mycompose.ui.component.row.SuperHeroView
import com.example.mycompose.ui.component.row.SuperHeroView2
import com.example.mycompose.ui.theme.MyComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "",
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                    SuperHeroView()
                    SuperHeroView2()

                }
            }
        }
    }
}

@Composable  //todas las funciones deven ir con el @Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = " $name",
        modifier = modifier
    )
}

//@Preview(showBackground = true)  //para que se visualice la pantalla en el dispositivo
@Composable
fun GreetingPreview() {
    MyComposeTheme {
        Greeting("Richard")
    }
}
//funcion para visualizar las Preview
@Preview(showBackground = true)
@Composable
fun ShowPreview() {
    ModifierExample()
    GreetingPreview()
}