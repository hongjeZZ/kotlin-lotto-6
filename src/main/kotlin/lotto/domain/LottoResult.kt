package lotto.domain

class LottoResult {
    private val results = mutableMapOf<Rank, Int>()

    init {
        for (rank in Rank.entries) {
            results[rank] = 0
        }
    }

    fun getRankCount(rank: Rank): Int = results[rank]!!

    fun updateCount(rank: Rank) = results.replace(rank, results.getValue(rank) + 1)

    fun getResult(): MutableMap<Rank, Int> = results
}