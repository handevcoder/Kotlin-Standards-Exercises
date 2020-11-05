import java.io.Serial
data class Customer (

    @Serial("id") val id : Int,
    @Serial("name") val name : String
)

data class Items (

    @SerializedName("id") val id : Int,
    @SerializedName("name") val name : String,
    @SerializedName("qty") val qty : Int,
    @SerializedName("price") val price : Int
)

data class Json4Kotlin_Base (

    @SerializedName("order_id") val order_id : String,
    @SerializedName("created_at") val created_at : String,
    @SerializedName("customer") val customer : Customer,
    @SerializedName("items") val items : List<Items>
)