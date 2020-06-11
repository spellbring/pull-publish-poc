# POC Subscriber

Proof of concept of pull strategy in GCP Pub / Sub

## Technology

- Java 11
- Springboot
- GCP PubSub

## Prerequisites

You must have a GCP account and have the PubSub service API enabled, and you must create a theme and a subscription, as demonstrated in the following guide:

https://cloud.google.com/pubsub/docs/admin?hl=es-419#pubsub-create-topic-cli

You must generate a service account from the GCP IAM, as demonstrated in the following guide: https://cloud.google.com/docs/authentication/getting-started


If you followed the steps in such a guide, you should leave the path of the json you downloaded from IAM in an environment variable, as shown below:

```
export GOOGLE_APPLICATION_CREDENTIALS=[PATH_OF_SERVICE_ACCOUNT.json]
```

## Usage

You must replace the value found in the application.properties file with the subscription you created in Pub / Sub

```
#TODO put the subscription name here:
project.subscription.name=

```

After that, you can run the gradle command to compile the sources:

```
./gradlew clean build

```

Then you need to run the following command to run the jar that was generated with gradle:

```
java -jar build/libs/*.jar
```

To finish, you can post a message directly to the GCP console in the topic area
https://cloud.google.com/pubsub/docs/publisher?hl=es-419#command-line

