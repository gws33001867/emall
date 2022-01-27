# emall 👋
> 🤫基于 Spring Cloud Alibaba 搭建微服务基础框架 

![Version](https://img.shields.io/badge/version-v1.0-blue)
![Version](https://img.shields.io/badge/java-8-orange)

main分支为基础框架，不包含业务代码

# 集成内容
- **nacos**
- **oauth2.0**
- **gateway**
- **redis**
- **mybatis-plus**

## OAuth2.0认证中心

[OAuth学习文章](https://juejin.cn/post/7038790554485784607)

[阮一峰OAuth2.0讲解](https://www.ruanyifeng.com/blog/2019/04/github-oauth.html)

### 常用模式

  - 授权码模式 authorization_code
    场景： 对安全性要求较高，web项目中一般使用授权码模式
  - 简化模式 token
    场景：适用于纯前端应用，不安全。Token有效期短，浏览器关闭即失效
  - 密码模式 password
    场景：需要输入账号密码，极度不安全，需要高度信任第三方应用
       适用于其他授权模式都无法采用的情况；原生APP可以使用，web不建议使用
  - 客户端模式 client_credentials 
    场景：授权维度为应用维度，而不是用户维度。因此有可能多个用户共用一个Token的情况。适用于应用维度的共享资源。适用于服务器之间交互，不需要用户参与。
## Gateway
> 保护、增强和控制对于 API 服务的访问。为微服务架构提供一种简单而有效的统一的API路由管理方式。