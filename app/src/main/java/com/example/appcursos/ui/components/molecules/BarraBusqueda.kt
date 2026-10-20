package com.example.appcursos.ui.components.molecules

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

@Composable
fun BarraBusqueda(
    texto: String,
    onTextoCambio: (String) -> Unit
) {

    OutlinedTextField(
        value = texto,
        onValueChange = onTextoCambio,
        modifier = Modifier.fillMaxWidth(),
        placeholder = {
            Text("Buscar curso...")
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Buscar",
                tint = Color.Gray
            )
        },
        shape = RoundedCornerShape(10.dp),
        singleLine = true
    )
}