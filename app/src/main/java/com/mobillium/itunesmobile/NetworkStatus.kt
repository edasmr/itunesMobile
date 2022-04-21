package com.mobillium.itunesmobile

sealed class NetworkStatus  {
    object Success : NetworkStatus()
    object Loading : NetworkStatus()
    object Error : NetworkStatus()
}
