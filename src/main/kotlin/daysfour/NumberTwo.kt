package prog

fun main() {
    stringCountWord()
}

fun stringCountWord() {
    val text = "Aku ingin begini\n" +
            "Aku ingin begitu\n" +
            "Ingin ini itu banyak sekali\n\n" +
            "Semua semua semua\n" +
            "Dapat dikabulkan\n" +
            "Dapat dikabulkan\n" +
            "Dengan kantong ajaib\n\n" +
            "Aku ingin terbang bebas\n" +
            "Di angkasa\n" +
            "Hei… baling baling bambu\n\n" +
            "La... la... la...\n" +
            "Aku sayang sekali\n" +
            "Doraemon\n\n" +
            "La... la... la...\n" +
            "Aku sayang sekali"
    val word = "aku"
    val word1 = "ingin"
    val word2 = "la..."
    println("%s = %s".format(word, findWord(text.toLowerCase(), word)))
    println("%s = %s".format(word, findWord(text.toLowerCase(), word1)))
    println("%s = %s".format(word, findWord(text.toLowerCase(), word2)))
}

fun findWord(text: String, word: String): Int {
    var result = 0
    var i = 0
    var j = 0
    while (i < text.toLowerCase().length) {
        if (text[i] == word[j]) {
            if (j == word.length - 1) {
                result++
                j = 0
            } else {
                j++
            }
        } else {
            j = 0
        }
        i++
    }
    return result
}
