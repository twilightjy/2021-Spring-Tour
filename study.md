# 1、Swagger

## 1.1常用注解

@ApiOperation不是spring自带的注解是swagger里的 
com.wordnik.swagger.annotations.ApiOperation;

@ApiOperation和@ApiParam为添加的API相关注解，个参数说明如下： 
@ApiOperation(value = “接口说明”, httpMethod = “接口请求方式”, response = “接口返回参数类型”, notes = “接口发布说明”）；其他参数可参考源码； 
@ApiParam(required = “是否必须参数”, name = “参数名称”, value = “参数具体描述”）

实际项目中非常需要写文档，提高Java服务端和Web前端以及移动端的对接效率。

Swagger是当前最好用的Restful API文档生成的开源项目，通过swagger-spring项目

实现了与SpingMVC框架的无缝集成功能，方便生成spring restful风格的接口文档，

同时swagger-ui还可以测试spring restful风格的接口功能。

   @ApiImplicitParam：用在 @ApiImplicitParams 注解中，指定一个请求参数的配置信息    
    name：参数名
    value：参数的汉字说明、解释
    required：参数是否必须传
    paramType：参数放在哪个地方
      · header --> 请求参数的获取：@RequestHeader
      · query --> 请求参数的获取：@RequestParam
      · path（用于restful接口）--> 请求参数的获取：@PathVariable
      · body（不常用）
      · form（不常用）   
    dataType：参数类型，默认String，其它值dataType="Integer"    
    defaultValue：参数的默认值