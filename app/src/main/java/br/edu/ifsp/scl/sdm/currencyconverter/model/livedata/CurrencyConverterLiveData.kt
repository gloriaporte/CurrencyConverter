package br.edu.ifsp.scl.sdm.currencyconverter.model.livedata

import ConversionResult
import CurrencyList
import androidx.lifecycle.MutableLiveData

object CurrencyConverterLiveData {
    val currenciesLiveData = MutableLiveData<CurrencyList>()
    val conversionResultLiveData = MutableLiveData<ConversionResult>()
}