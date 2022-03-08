package priyanshumaurya8868.com.data

import kotlinx.serialization.Serializable


//this  annatation  allow us to parse this class to JSON
@Serializable
data class Rabbit(
    val name : String,
    val description : String,
    val imageUrl : String
)
