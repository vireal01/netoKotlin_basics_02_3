fun main() {
    fun makePurchase(price: Int, purchases: Int, isMusicLover: Boolean ): Int{
        val priceToPay:Int
        priceToPay = if (purchases <= 100_000 ) {
            price
        } else if ( purchases > 100_000 && purchases < 1_000_000) {
            price - 10_000
        } else {
            (price * 0.95).toInt()
        }
        return (if (isMusicLover) (priceToPay * 0.99).toInt() else priceToPay)
    }

    fun getFinalPriceAsString(priceToPay: Int, customerSumOfPurchases: Int, isMusicLover: Boolean): String {
        val price  = makePurchase(priceToPay, customerSumOfPurchases, isMusicLover)
        return ("${price / 100} руб. ${price % 100} коп.")
    }
    println(getFinalPriceAsString(10_000, 0, false ))
    println(getFinalPriceAsString(10_000, 100_001, false ))
    println(getFinalPriceAsString(100_000, 100_001, false ))
    println(getFinalPriceAsString(10_000, 1_000_001, false ))
    println(getFinalPriceAsString(10_000, 0, true ))
    println(getFinalPriceAsString(10_000, 1_000_001, true ))
}
