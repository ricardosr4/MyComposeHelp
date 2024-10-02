package com.example.mycompose.ui.component.image

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycompose.R

@Preview
@Composable
fun ImageExample() {
    Column {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .height(460.dp)
                .fillMaxWidth()
                .background(Color.Red)
        ) {

            Image(
                painter = painterResource(id = R.drawable.img_example),
                contentDescription = "imageExample",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()

            )

        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
                .padding(16.dp)
        ) {
            Text(
                text = "Richard",
                style = MaterialTheme.typography.bodyLarge
            )

        }
    }
}
