package com.example.appcursos.ui.components.atoms

import android.widget.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material3.TextButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.Alignment


@Composable
fun BotonPrimary(
    texto: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF2146F3),
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(text = texto)
    }
}

@Composable
fun BotonRojo(
    texto: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(text = texto)
    }
}
@Composable
fun BotonFiltro(
    texto: String,
    seleccionado: Boolean,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (seleccionado) {
                Color(0xFF2146F3)
            } else {
                Color(0xFFE5E5E5)
            },
            contentColor = if (seleccionado) {
                Color.White
            } else {
                Color.DarkGray
            }
        ),
        shape = RoundedCornerShape(20.dp)
    ) {
        Text(text = texto)
    }
}

@Composable
fun BotonNavegacion(
    texto: String,
    icono: ImageVector,
    seleccionado: Boolean,
    onClick: () -> Unit
) {
    TextButton(
        onClick = onClick
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = icono,
                contentDescription = texto,
                tint = if (seleccionado) {
                    Color(0xFF2146F3)
                } else {
                    Color.Gray
                }
            )

            Text(
                text = texto,
                color = if (seleccionado) {
                    Color(0xFF2146F3)
                } else {
                    Color.Gray
                }
            )
        }
    }
}
@Composable
fun BotonIcono(
    icono: ImageVector,
    descripcion: String,
    onClick: () -> Unit
) {
    IconButton(
        onClick = onClick
    ) {
        Icon(
            imageVector = icono,
            contentDescription = descripcion
        )
    }
}