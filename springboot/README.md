### 部署

#### 1、linux后台运行
```
nohup java -jar springboot-0.0.1-SNAPSHOT.jar > logName.log 2>&1

查询进程
ps -ef | grep java | grep springboot-0.0.1-SNAPSHOT.jar

kill -9 pid
```

#### 问题记录

1、若遇到报: no main manifest attribute, in springboot-0.0.1-SNAPSHOT.jar
``` 
  解决方法：删掉 <skip>true</skip> 即可。
    在pom.xml文件中添加以下配置：
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <configuration>
                    <archive>
                        <manifest>
                            <mainClass>com.example.demo.DemoApplication</mainClass>
                        </manifest>
                    </archive>
                </configuration>
            </plugin>
        </plugins>
    </build>
```


