# spring-dgs-demo

This application is based on offical Getting Started from
the [DGS project](https://netflix.github.io/dgs/getting-started/)

## Run it

Use the following command to run the application

```shell
/gradlew bootRun
```

When it's running open `http://localhost:8080/graphiql` in your browser. This will open a GraphiQL client you can use
for test

## Sample queries

Here are some example queries you can use for testing GraphQL capabilities

### Show all shows

```graphql
{
    shows {
        title
        releaseYear
    }
}
```

### Show shows filtered by title

```graphql
{
    shows(titleFilter:"Stranger") {
        title
        releaseYear
    }
}
```
