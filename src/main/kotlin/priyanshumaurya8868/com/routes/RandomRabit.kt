package priyanshumaurya8868.com.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import priyanshumaurya8868.com.data.Rabbit

const val BASE_URL = "http://192.168.43.150:2001"

private val rabbits = listOf(
    Rabbit("Carl", "A cute rabbit that like to eat strawberries...!", "$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("Monu", "This rabbit likes to eat flowers...!", "$BASE_URL/rabbits/rabbit2.jpg"),
    Rabbit("Sonu", "A cute rabbit that like to play a lot...!", "$BASE_URL/rabbits/rabbit3.jpg"),
    Rabbit("Raju", "A cute rabbit that looks angry and frustrated...!", "$BASE_URL/rabbits/rabbit4.jpg"),
    Rabbit("Riya", "A cute rabbit that is a crush  of almost every single rabbit...!", "$BASE_URL/rabbits/rabbit5.jpg")
)

fun Route.randomRabbit() {
    get("/randomrabbit") {
//        incase if  i have used params in our url
//        call.parameters["rabbitId"]

        call.respond(
        HttpStatusCode.OK,
        rabbits.random()
        )

    }
}
