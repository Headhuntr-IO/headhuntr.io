package io.headhuntr.poc.localstack;

import io.micronaut.context.annotation.Requirements
import io.micronaut.context.annotation.Requires
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import jakarta.inject.Singleton

@Requirements(Requires(beans = [DynamoDbClient::class, DynamoConfiguration::class]),
        Requires(condition = CIAwsCredentialsProviderChainCondition::class),
        Requires(condition = CIAwsRegionProviderChainCondition::class),
)
@Singleton
class DynamoRepository(private val dynamoDbClient: DynamoDbClient, private val dynamoConfiguration: DynamoConfiguration)  {
}