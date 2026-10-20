package com.example.appcursos.ui.components.organisms
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.appcursos.ui.components.atoms.BotonFiltro

@Composable
fun FiltrosCursos(
    filtroSeleccionado: String,
    onFiltroClick: (String) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        BotonFiltro(
            texto = "Todos",
            seleccionado = filtroSeleccionado == "Todos",
            onClick = {
                onFiltroClick("Todos")
            }
        )

        BotonFiltro(
            texto = "Código",
            seleccionado = filtroSeleccionado == "Código",
            onClick = {
                onFiltroClick("Código")
            }
        )

        BotonFiltro(
            texto = "Diseño",
            seleccionado = filtroSeleccionado == "Diseño",
            onClick = {
                onFiltroClick("Diseño")
            }
        )
    }
}