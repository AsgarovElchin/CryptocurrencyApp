package asgarov.elchin.cryptocurrencyapp.presentation.coin_list

import asgarov.elchin.cryptocurrencyapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
