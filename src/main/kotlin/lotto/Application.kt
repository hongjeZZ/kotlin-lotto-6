package lotto

import lotto.domain.LottoProgram
import lotto.ui.InputManager
import lotto.ui.OutputManager

fun main() {
    val lottoProgram = LottoProgram(InputManager(),OutputManager())
    lottoProgram.run()
}