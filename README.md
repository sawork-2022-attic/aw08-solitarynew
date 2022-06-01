> Consider the advantage by doing so and write it down in your readme file.

- 在网关构造了两个名为inGate和outGate的Bean，前者将网关响应的请求的相关内容放入sampleChannel中，后者从channel中取出消息转发请求。为了传递路径参数，将路径参数放入message的payload中供消费者构造uri
- 与传统的网关方式转发请求相比，Spring-Integration是消息驱动的、异步的，且使用时可以添加许多自定义操作，提供了更好的抽象与再使用的能力。Spring Integration降低了不同组件之间的耦合性，在不同的粒度下组装调用内部与外部组件，完成更加复杂的功能。

# aw08

Run the project with `mvn spring-boot:run` and send request to `http://localhost:8080/check`. You should see an reponses in json format like the following.

```json
{
    "icon_url": "https://assets.chucknorris.host/img/avatar/chuck-norris.png",
    "id": "kswv7NIaTCaIIErlBzODaA",
    "url": "https://api.chucknorris.io/jokes/kswv7NIaTCaIIErlBzODaA",
    "value": "Chuck Norris's shadow weighs 250 pounds and can kick your ass ."
}
```

Try to understand the provided code which demonstrates spring integration between a spring boot application with an externel http service (https://api.chucknorris.io/jokes/random).

Please implement delivery as an standalone service (just like the random joke service). Refer the sample code to integrate your Micropos system with delivery service so that user can check delivery status on Miropos which actually forwards user request to delivery service on demand.

![](Micropos.svg)

Consider the advantage by doing so and write it down in your readme file.