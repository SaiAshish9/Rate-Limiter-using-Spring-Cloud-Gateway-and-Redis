<img width="1266" alt="Screenshot 2022-12-28 at 5 43 28 PM" src="https://user-images.githubusercontent.com/43849911/209810569-18868c13-8015-4f43-9a24-dec4401aa25a.png">

<img width="1792" alt="Screenshot 2022-12-29 at 12 00 33 AM" src="https://user-images.githubusercontent.com/43849911/209856972-61fbbaaf-909f-40d4-a8e3-ac3b907cccff.png">

<img width="1290" alt="Screenshot 2022-12-29 at 12 15 27 AM" src="https://user-images.githubusercontent.com/43849911/209858458-c9b79272-92ff-4596-b48a-289ec6be514f.png">

<img width="1278" alt="Screenshot 2022-12-29 at 12 19 48 AM" src="https://user-images.githubusercontent.com/43849911/209858813-d88b7a79-8108-47c6-8d7d-6ec427359d94.png">

Spring Cloud Gateway has the mapping for GET endpoint.

Redis has all the data for rate limiting.

With Resilience4J and Bucket4j we can add code within the application most of the times.

We won't be able to apply rate limiters within the application while scaling.

But gateway can be scaled

https://redis.io/docs/getting-started/installation/install-redis-on-mac-os/
https://redis.com/redis-enterprise/redis-insight/

```
Type in terminal:

redis-server
```
https://developer.redis.com/explore/import/

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
