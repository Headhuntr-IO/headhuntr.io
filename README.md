# Headhuntr.io
JIRA Board
- [MVP](https://headhuntr.atlassian.net/jira/software/projects/MVP/boards/1)

This project will be mainly for demonstrating my skills in the following area:
- AWS Certified Solutions Architect Professional
- AWS Certified Developer Associate
- AWS Certified Data Analytics Specialty
- AWS Certified Machine Learning Specialty
- Tensorflow Certified Developer


![Architecture](images/HH2ArchitectureV1.0.0.png)

## Phase 1: Application
This basically covers the AWS Developer certification
- establish a IaC setup using CDK
- simple React + Amplify app with a basic Cognito registration+authentication
- setup a BE using SAM and expose it using AppSync
- setup a build pipeline for the FE+BE using Code Pipeline
- persistence with DynamoDB
- search with ES
- monitoring with Cloudwatch and Xray
- event notification with SNS

## Phase 2: Data Processing and Analytics
This is where we practice for the AWS Data Analytics specialty
- intake for client logs using Kinesis Firehose via Lambda@Edge
- use Glue and Athena to analyze our candidates data
- use Glue to populate the search database
- job coordination via Step Function (Possible initiated by EventBridge or SQS - from somewhere in the server)
- app dashboard using Quicksight

## Phase 3: Machine Learning
This is the icing of the cake where we obviously would get the Certified Machine Learning Specialization certificate and Tensorflow
- use NLP to tag our source data


#### Resources
- [Firehose with Lambda@Edge](https://aws.amazon.com/blogs/networking-and-content-delivery/global-data-ingestion-with-amazon-cloudfront-and-lambdaedge/)
- [FastAPI+Tensorflow+Docker](https://towardsdatascience.com/tensorflow-model-deployment-using-fastapi-docker-4b398251af75)
