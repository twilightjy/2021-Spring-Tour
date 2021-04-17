项目架构：

前端：vue+elementui+echarts

后端：SpringBoot + nginx + docker + SpringSecurity + Swagger2 + MyBatisPlus + Mysql + Redis + elasticsearch + rabbitMQ + MaxWell。采用elasticsearch做为搜索引擎，支持搜索结果分词和高亮。使用MaxWell监听mysql数据，绑定RabbitMQ消息队列同步es文章数据