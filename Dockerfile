FROM openjdk:17-jdk-alpine

COPY target/article_get-SNAPSHOT.jar article_get_function.jar
ENTRYPOINT ["java","-jar","/article_get_function.jar"]
#CMD [ "example.App::sayHello" ]


FROM public.ecr.aws/aleph0io/lambda/java:17.0.4-al2

COPY target/hello-lambda.jar "${LAMBDA_TASK_ROOT}/lib/"

CMD [ "com.example.article_get.Greeter::apply" ]