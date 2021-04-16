# 1、Swagger

接口管理统一规范

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

# 2、QueryWrapper的改进

```
// 获取分页数据,用LamdaQueryWrapper替代QueryWrapper，链式查询，可读性更好，通过.容易扩展
Page<Article> articlePage = articleDao.selectPage(page, new LambdaQueryWrapper<Article>()
        .select(Article::getId, Article::getArticleTitle, Article::getCreateTime)
        .orderByDesc(Article::getCreateTime)
        .eq(Article::getIsDelete, FALSE)
        .eq(Article::getIsDraft, FALSE));
```

# 3、SQL语句join on的使用

join具有 **连接**的作用，即当两个或者两个以上的表有关系时，需要join来连接这些相关的表，来处理或分析数据。跨表查询,多表关联查询

举例：https://blog.csdn.net/weixin_44177568/article/details/103038236

# 4、Lombok中@Builder用法

Builder 使用创建者模式又叫建造者模式。简单来说，就是一步步创建一个对象，它对用户屏蔽了里面构建的细节，但却可以精细地控制对象的构造过程。

# 5、List foreach方法

forEach（）方法是Iterable<T>接口中的一个方法。Java容器中，所有的Collection子类（List、Set）会实现Iteratable接口以实现foreach功能。forEach（）方法里面有个Consumer类型，它是Java8新增的一个消费型函数式接口，其中的accept(T t)方法代表了接受一个输入参数并且无返回的操作。foreach为开发人员提供了极大的方便。在复杂的循环设计时，还是应该使用for循环更加的灵活。

# 6、Objects.requireNonNull

非空检查常用方法

# 7、对redis五种基本数据类型的常用操作

https://www.jianshu.com/p/e62d04c31d6e



# 8、泛型方法

定义泛型方法时，必须在返回值前边加一个<T>，来声明这是一个泛型方法，持有一个泛型T，然后才可以用泛型T作为方法的返回值

![img](https://iknow-pic.cdn.bcebos.com/3b292df5e0fe99255a43f44a3fa85edf8db17159?x-bce-process=image/resize,m_lfit,w_600,h_800,limit_1/quality,q_85/format,f_jpg)

# 9、操作日志注解中的注解

```
@Target(ElementType.METHOD) 描述该注解使用的范围 METHOD 用于方法
@Retention(RetentionPolicy.RUNTIME)  
@Documented
```

https://www.jianshu.com/p/8738ce6bd771

# 10、MultipartFile类型

multipartfile是spring类型，代表HTML中form data方式上传的文件，包含二进制数据+文件名称。

https://blog.csdn.net/a1191835397/article/details/90951345

# 11、@Transactional(rollbackFor = Exception.class

针对Exception对事物进行回滚

# 12、很过分的一种炫技写法

```
@Transactional(rollbackFor = Exception.class)//出异常后进行事务回滚
@Override
public void updateArticleDelete(DeleteVO deleteVO) {
    // 修改文章逻辑删除状态
    List<Article> articleList = deleteVO.getIdList().stream().map(id -> Article.builder()
            .id(id)
            .isTop(FALSE)
            .isDelete(deleteVO.getIsDelete())
            .build())
            .collect(Collectors.toList());
    articleService.updateBatchById(articleList);
}
```

# 13、Calendar add方法

第一个参数：如果是1则代表的是对年份操作，2是对月份操作，3是对星期操作，5是对日期操作，11是对小时操作，12是对分钟操作，13是对秒操作，14是对毫秒操作。在Calendar中这些数字被定义为static final Integer可以直接调用

第二个参数：日历的偏移量，可以指定一个日历中的字段，进行整数的偏移。

# 14、@Scheduled(cron = " 0 0 0 * * ?")

指定某个方法在特定的时间执行  上述写法即每天0点整执行一次

https://blog.csdn.net/m0_37179470/article/details/81271607

# 15、QueryWrapper模糊查询

https://blog.csdn.net/weixin_45121502/article/details/106016157

# 16、ElasticSearch HightLight用法

https://blog.csdn.net/qq330983778/article/details/103690377

# 17、NativeSearchQueryBuilder用法

https://blog.csdn.net/qq_40885085/article/details/105024625