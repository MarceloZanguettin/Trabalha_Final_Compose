package com.example.trabalhafinalcompose.ui.lancamento.form.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.trabalhafinalcompose.data.TipoLancamentoEnum
import com.example.trabalhafinalcompose.ui.theme.TrabalhaFinalComposeTheme

@Composable
fun FormRadioButton(
    modifier: Modifier = Modifier,
    value: TipoLancamentoEnum,
    groupValue: TipoLancamentoEnum,
    onValueChanged: (TipoLancamentoEnum) -> Unit,
    enabled: Boolean = true,
    label: String
) {
    Row(
        modifier = modifier
            .clickable(
                onClick = { onValueChanged(value) },
                enabled = enabled
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(
            selected = value == groupValue,
            onClick = { onValueChanged(value) },
            enabled = enabled
        )
        Text(label)
    }
}

@Preview(showBackground = true)
@Composable
private fun FormRadioButtonPreview() {
    TrabalhaFinalComposeTheme {
        var groupValue by remember { mutableStateOf(TipoLancamentoEnum.DESPESA) }
        Column {
            FormRadioButton(
                modifier = Modifier.padding(20.dp),
                value = TipoLancamentoEnum.DESPESA,
                groupValue = groupValue,
                onValueChanged = { newValue ->
                    groupValue = newValue
                },
                label = "Receita"
            )
            FormRadioButton(
                modifier = Modifier.padding(20.dp),
                value = TipoLancamentoEnum.RECEITA,
                groupValue = groupValue,
                onValueChanged = { newValue ->
                    groupValue = newValue
                },
                label = "Despesa"
            )
        }
    }
}