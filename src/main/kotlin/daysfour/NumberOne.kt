package daysfour

fun isPalindrome(myStrings: String): Boolean {
    var result = false
    val reverseString = myStrings.reversed()
    when { myStrings.toLowerCase() == reverseString.toLowerCase() -> result = true }
    return result
}

fun main() {
    print("Words String : ")
    val input: String = readLine().toString()

    when {
        isPalindrome(input) -> println("Palindrome")
        else -> println("Not Palindrome")
    }
}
