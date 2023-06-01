package com.deba.composecalculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deba.composecalculator.ui.theme.DarkGray
import com.deba.composecalculator.ui.theme.LightGray
import com.deba.composecalculator.ui.theme.Orange

@Composable
fun Calculator(
    modifier: Modifier = Modifier,
    state: CalculatorState,
    buttonSpacing: Dp = 8.dp,
    onAction: (CalculatorAction) -> Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 60.sp,
                color = Color.White,
                maxLines = 2
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "AC",
                    modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f),
                    backgroundColor = LightGray,
                    onClick = {
                        onAction(CalculatorAction.Clear)
                    }
                )
                CalculatorButton(
                    symbol = "Del",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = LightGray,
                    onClick = {
                        onAction(CalculatorAction.Delete)
                    }
                )
                CalculatorButton(
                    symbol = "/",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = Orange,
                    onClick = {
                        onAction(
                            CalculatorAction.Operation(
                                operation = CalculatorOperation.Divide
                            )
                        )
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = DarkGray,
                    onClick = {
                        onAction(CalculatorAction.Number(number = 7))
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = DarkGray,
                    onClick = {
                        onAction(CalculatorAction.Number(number = 8))
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = DarkGray,
                    onClick = {
                        onAction(CalculatorAction.Number(number = 9))
                    }
                )
                CalculatorButton(
                    symbol = "x",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = Orange,
                    onClick = {
                        onAction(
                            CalculatorAction.Operation(
                                operation = CalculatorOperation.Multiply
                            )
                        )
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = DarkGray,
                    onClick = {
                        onAction(CalculatorAction.Number(number = 4))
                    }
                )
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = DarkGray,
                    onClick = {
                        onAction(CalculatorAction.Number(number = 5))
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = DarkGray,
                    onClick = {
                        onAction(CalculatorAction.Number(number = 6))
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = Orange,
                    onClick = {
                        onAction(
                            CalculatorAction.Operation(
                                operation = CalculatorOperation.Subtract
                            )
                        )
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = DarkGray,
                    onClick = {
                        onAction(CalculatorAction.Number(number = 1))
                    }
                )
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = DarkGray,
                    onClick = {
                        onAction(CalculatorAction.Number(number = 2))
                    }
                )
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = DarkGray,
                    onClick = {
                        onAction(CalculatorAction.Number(number = 3))
                    }
                )
                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = Orange,
                    onClick = {
                        onAction(
                            CalculatorAction.Operation(
                                operation = CalculatorOperation.Add
                            )
                        )
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f),
                    backgroundColor = DarkGray,
                    onClick = {
                        onAction(CalculatorAction.Number(number = 0))
                    }
                )
                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = DarkGray,
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = Orange,
                    onClick = {
                        onAction(CalculatorAction.Calculate)
                    }
                )
            }
        }
    }
}
