### Knowledge

#### 1、springboot控制器
  Spring Boot提供了@Controller和@RestController两种注解来标识此类负责接收和处理HTTP请求。
  如果请求的是页面和数据，使用@Controller注解即可；
  如果只是请求数据，则可以使用@RestController注解。
 
  @Controller的用法
  示例中返回了hello页面和name的数据，在前端页面中可以通过${name}参数, 获取后台返回的数据并显示。
  @Controller通常与Thymeleaf模板引擎结合使用
 
  @RestController的用法
  默认情况下，@RestController注解会将返回的对象数据转换为JSON格式。

#### 2、路由映射
  @RequestMapping注解主要负责URL的路由映射。它可以添加在Controller 类或者具体的方法上。
  如果添加在Controller类上，则这个Controller中的所有路由映射都将会加上此映射规则，如果添加在方法上，则只对当前方法生效。
  @RequestMapping注解包含很多属性参数来定义HTTP的请求映射规则。常用的属性参数如下：
  value: 请求URL的路径，支持URL模板、正则表达式
  method: HTTP请求方法
  consumes: 请求的媒体类型（Content-Type），如application/json
  produces: 响应的媒体类型
  params，headers: 请求的参数及请求头的值