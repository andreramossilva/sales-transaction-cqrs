package com.sales.transaction.api.resource

data class SaleRequest(
        val productId: Int,
        val userId: Int,
        val addressId: Int
)