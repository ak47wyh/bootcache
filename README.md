echo "# bootcache" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/ak47wyh/bootcache.git
git push -u origin master

默认缓存技术：ConcurrentMapCacheManager
切换缓存技术
添加
<dependency>
    <groupId>com.google.guava</groupId>
    <artifactId>guava</artifactId>
    <version>LATEST</version>
</dependency>
或
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-redis</artifactId>
    <version>1.3.2.RELEASE</version>
</dependency>

本例使用ehcache
切换默认,把ehcache.xml
<dependency>
    <groupId>net.sf.ehcache</groupId>
    <artifactId>ehcache</artifactId>
</dependency>
依赖删除

测试
http://localhost:8080/abl?id=1

http://localhost:8080/put?name=wang&age=1&address=shanghai

http://localhost:8080/evit?id=2