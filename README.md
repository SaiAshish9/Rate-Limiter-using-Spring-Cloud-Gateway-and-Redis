<img width="1266" alt="Screenshot 2022-12-28 at 5 43 28 PM" src="https://user-images.githubusercontent.com/43849911/209810569-18868c13-8015-4f43-9a24-dec4401aa25a.png">

Spring Cloud Gateway has the mapping for GET endpoint.

Redis has all the data for rate limiting.

With Resilience4J and Bucket4j we can add code within the application most of the times.

We won't be able to apply rate limiters within the application while scaling.

But gateway can be scaled

https://redis.io/docs/getting-started/installation/install-redis-on-mac-os/

```
Type in terminal:

redis-server
```


Add followind dependencies to enable rate limiters:

```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-redis-reactive</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
		</dependency>
```
