package io.headhuntr.poc.localstack
import io.micronaut.function.aws.MicronautRequestHandler
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent
import jakarta.inject.Inject
class FunctionRequestHandler : MicronautRequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent>() {
    @Inject
    lateinit var objectMapper: ObjectMapper

    override fun execute(input: APIGatewayProxyRequestEvent): APIGatewayProxyResponseEvent {
        val response = APIGatewayProxyResponseEvent()
        try {
            val json = objectMapper.writeValueAsString(mapOf("message" to "Hello World"))
            response.statusCode = 200
            response.body = json
        } catch (e: JsonProcessingException) {
            response.statusCode = 500
        }
        return response
    }
}
