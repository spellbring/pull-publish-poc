#!/bin/sh

export GOOGLE_APPLICATION_CREDENTIALS=

./gradlew clean build

java -jar build/libs/*.jar


