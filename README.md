# BookManager
====

## 起動方法

1. 当プロジェクトをIntelliJ IDEAにGradleProjectとしてclone  
2. docker-composeよりPostgres,SonarQubeを起動  
    `$ cd docker`  
    `$ docker-compose -f docker-compose.yml build`  
    `$ docker-compose -f docker-compose.yml up -d`  
3. GradleタスクよりbootRun(`:micro-api -> Tasks -> application -> bootRun`)
4. GradleタスクよりbootRun(`:micro-admin -> Tasks -> application -> bootRun`)

## 停止方法

1. bootRunの停止  
2. docker-composeより停止  
    `$ cd docker`  
    `$ docker-compose -f docker-compose.yml stop`
3. docker-composeよりコンテナ破棄  
    `$ docker-compose -f docker-compose.yml down`
        
## 構成

Gradleのマルチプロジェクト構成をとっています。

```
BookManager                           … rootプロジェクト
- config                              … build.gradleから使用するTool群の設定ファイル格納フォルダ
- docker                              … docker-compose格納フォルダ
- - pgadmin                           … 
- - postgres                          … 
- - sonarqube                         … 
- - docker-compose.yaml               … dockerコンテナ起動ファイル
- document                            … 各種ドキュメント格納フォルダ
- gradle                              … 
- micro-admin                         … Adminプロジェクト
- micro-api                           … RestApiプロジェクト
- micro-config                        … (仮)
- micro-interfaces                    … RestApiのI/Oを定義したプロジェクト
- micro-rdb                           … (仮)
- micro-test                          … Testツールを格納したプロジェクト
- micro-validator                     … 値オブジェクトを格納したプロジェクト
- build.gradle                        … Gradle プロジェクト定義
- gradle.properties                   … Gradle プロジェクト定義
- settings.gradle                     … Gradle プロジェクト設定
```    

## Endpoints

[PgAdmin][]
[SonarQube][]  
[HAL Browser][]  

## 環境

### Middleware

| name              | version
| :---------------- | :-------
| OpenJdk           | 11
| DockerCompose     | 1.21.2
| Gradle            | 4.10 
| SonarQube         | 7.1

### Library

| name               | version
| :----------------- | :------
| SpringBoot         | 2.1.x
| SpringFox          | 2.x

[PgAdmin]: http://localhost:80/browser/     "PgAdmin"
[SonarQube]: http://localhost:9000/sonar/     "SonarQube"
[HAL Browser]: http://localhost:8075/     "HAL Browser"