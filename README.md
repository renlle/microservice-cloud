# SpringCloud微服务架构练习 

#### 介绍

基于SpringCloud的微服务框架练习,技术栈包含: 

1. Rest微服务构建案例工程模块
  1. 通用模块api
  2. 服务提供者Provider集群
  3. 服务消费者Consumer集群
2. Eureka服务注册与发现
   1. Eureka的基本架构
   2. Eureka服务注册中心
   3. Eureka集群配置
3. Ribbon负载均衡
   1. Ribbon配置初步
   2. Ribbon负载均衡
   3. Ribbon核心组件IRule
   4. Ribbon自定义负载均衡规则
4. Feign负载均衡
5. Hystrix断路器
   1. 服务熔断
   2. 服务降级
   3. 服务监控hystrixDashboard
6. zuul路由网关
   1. 路由基本配置
   2. 路由访问映射规则
   3. 原真实服务名忽略及设置统一公共前缀
7. SpringCloud Config分布式配置中心
   1. SpringCloud Config服务端配置
   2. SpringCloud Config客户端配置与测试
   3. SpringCloud Config配置实战

#### 软件架构

软件架构说明: 整体主要使用SpringMVC+SpringBoot/Spring+MyBatis+gitee+Vue组合进行开发; SpringCloud的技术参照上文的介绍.


#### 安装教程

1. 配置本机host文件
    *  127.0.0.1 eureka7001.com
    *  127.0.0.1 eureka7002.com
    *  127.0.0.1 eureka7003.com
    *  127.0.0.1  myzuul.com
    *  127.0.0.1  config-3344.com 
    *  127.0.0.1  client-config.com
2. 克隆到本地即可
   git clone https://gitee.com/renlle/microservicecloud_szs.git
3. 处理maven工程
   1. maven clean
   2. maven compile
   3. maven install
4. 运行


#### 使用说明

1. xxxx
2. xxxx
3. xxxx

#### 参与贡献

1. Fork 本仓库
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request
