
data class Customer (
    val id : Int,
    val name : String
)

data class Items (

    val id : Int,
    val name : String,
    val qty : Int,
    val price : Int
)

data class Purchase (
    val order_id : String,
    val created_at : String,
    val customer : Customer,
    val items : List<Items>
)