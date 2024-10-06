package com.example.mycompose.ui.component.row

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycompose.R
import com.example.mycompose.model.SuperHeroModel

//funcion para crear la vista
@Composable
fun SuperHeroView() {
    val context = LocalContext.current

    LazyRow(
        modifier = Modifier
            .padding(top = 50.dp, start = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(getSuperHeroes()) { superhero ->
            ItemHero(superHeroModel = superhero)
            { Toast.makeText(context, it.superHeroName, Toast.LENGTH_SHORT).show() }
        }
    }
}

//funcion para crear el item
@Composable
fun ItemHero(superHeroModel: SuperHeroModel, onItemSelected: (SuperHeroModel) -> Unit) {
    Card(
        border = BorderStroke(2.dp, Color.Red),
        modifier = Modifier
            .width(200.dp)
            .clickable { onItemSelected(superHeroModel) }
    ) {
        Column {
            Image(
                painter = painterResource(id = superHeroModel.photo),
                contentDescription = "imagen",
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = superHeroModel.superHeroName,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = superHeroModel.realName,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                fontSize = 12.sp
            )
            Text(
                text = superHeroModel.realName,
                modifier = Modifier
                    .padding(4.dp)
                    .align(Alignment.End),
                fontSize = 10.sp
            )
        }

    }

}
//funcion para obtener los datos
fun getSuperHeroes(): List<SuperHeroModel> {
    return listOf(
        SuperHeroModel("Spiderman", "Peter Parker", "Marvel", R.drawable.spiderman),
        SuperHeroModel("Wolverine", "James Howlett", "Marvel", R.drawable.logan),
        SuperHeroModel("Batman", "Bruce Wayne", "DC", R.drawable.batman),
        SuperHeroModel("Thor", "Thor Odinson", "Marvel", R.drawable.thor),
        SuperHeroModel("Flash", "Jay Garrick", "DC", R.drawable.flash),
        SuperHeroModel("Green Lantern", "Alan Scott", "DC", R.drawable.green_lantern),
        SuperHeroModel("Wonder Woman", "Princess Diana", "DC", R.drawable.wonder_woman)
    )


//segundo recyclerView
}
@Composable
fun SuperHeroView2() {
    val context = LocalContext.current

    LazyColumn(
        modifier = Modifier
            .padding(top = 350.dp, start = 10.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(getSuperHeroes2()) { superhero ->
            ItemHero2(superHeroModel = superhero)
            { Toast.makeText(context, it.superHeroName, Toast.LENGTH_SHORT).show() }
        }
    }
}

@Composable
fun ItemHero2(superHeroModel: SuperHeroModel, onItemSelected: (SuperHeroModel) -> Unit) {
    Card(
        border = BorderStroke(2.dp, Color.Red),
        modifier = Modifier
            .width(200.dp)
            .clickable { onItemSelected(superHeroModel) }
    ) {
        Column {
            Image(
                painter = painterResource(id = superHeroModel.photo),
                contentDescription = "imagen",
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = superHeroModel.superHeroName,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = superHeroModel.realName,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                fontSize = 12.sp
            )
            Text(
                text = superHeroModel.realName,
                modifier = Modifier
                    .padding(4.dp)
                    .align(Alignment.End),
                fontSize = 10.sp
            )
        }

    }

}

fun getSuperHeroes2(): List<SuperHeroModel> {
    return listOf(
        SuperHeroModel("Spiderman", "Peter Parker", "Marvel", R.drawable.spiderman),
        SuperHeroModel("Wolverine", "James Howlett", "Marvel", R.drawable.logan),
        SuperHeroModel("Batman", "Bruce Wayne", "DC", R.drawable.batman),
        SuperHeroModel("Thor", "Thor Odinson", "Marvel", R.drawable.thor),
        SuperHeroModel("Flash", "Jay Garrick", "DC", R.drawable.flash),
        SuperHeroModel("Green Lantern", "Alan Scott", "DC", R.drawable.green_lantern),
        SuperHeroModel("Wonder Woman", "Princess Diana", "DC", R.drawable.wonder_woman)
    )

}