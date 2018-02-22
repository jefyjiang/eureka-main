# eureka-main
> springcloud学习之eureka

---

### 包含以下子项目 ###  
- eureka-server 
- eureka-client
- eureka-consumer
- eureka-consumer-feign
- eureka-consumer-ribbon

### spring模块及版本 ###  
- springboot 1.5.8
- springcloud Dalston.SR4


## edgware版本实现了eureka与jersey2的兼容，感谢eureka团队 ##

>由于兼容性的问题（Dalston版本的eureka使用的是jsr311，而jersey2实现的是JAX-RS，这两个版本的rest接口不兼容），请选择springcloud的edgware版本，实现eureka与jersey2的兼容，示例请看edgware版本