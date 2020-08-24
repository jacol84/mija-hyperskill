fun parseCardNumber(cardNumber: String): Long {
    return if (cardNumber.matches(Regex("""\d{4} \d{4} \d{4} \d{4}"""))) {
        cardNumber.replace(" ", "").toLong()
    } else {
        throw Exception("the card number is incorrect.")
    }
}

