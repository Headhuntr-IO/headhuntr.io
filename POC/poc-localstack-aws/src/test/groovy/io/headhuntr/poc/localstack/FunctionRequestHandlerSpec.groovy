package io.headhuntr.poc.localstack
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

class FunctionRequestHandlerSpec extends Specification {

    @AutoCleanup
    @Shared
    FunctionRequestHandler handler = new FunctionRequestHandler()

    void "test Handler"() {
        given:
        APIGatewayProxyRequestEvent request = new APIGatewayProxyRequestEvent()
        request.setHttpMethod("GET")
        request.setPath("/")

        when:
        APIGatewayProxyResponseEvent response = handler.execute(request)

        then:
        200 == response.getStatusCode().intValue()
        "{\"message\":\"Hello World\"}" == response.body
    }
}
