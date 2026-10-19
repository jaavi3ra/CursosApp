package com.example.appcursos.ui.components.atoms

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun LogoIcon(
    img: Int,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = img),
        contentDescription = contentDescription,
        modifier = modifier
    )
}
/*@Composable
fun barraIcon(
    img: Image
) {

}*/