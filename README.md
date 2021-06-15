# gew-client-sample-java

Ginco Enterprise Wallet の API を Java から利用する場合のサンプル実装です。

## Requirements

* Java 8 or higher
* Maven

## Run sample
    
1. [gew-client-sample-java](https://github.com/GincoInc/gew-client-sample-java) をクローン
    * `git clone https://github.com/GincoInc/gew-client-java-sample`
2. gew-client-sample-java へ移動
    * `cd path/to/gew-client-sample-java`
3. 実行
    * `mvn exec:java -Dexec.mainClass="grpc.example.ExampleMain"`

## How to use gew-client-java

1. [gew-kmp](https://github.com/GincoInc/gew-kmp/) をクローン
    * `git clone https://github.com/GincoInc/gew-kmp`
2. `gen/java/` 配下の `adamant`, `gincoinc` フォルダを所望のクラスパス配下へ配置
    * 例えば本sampleは src/main/java 配下へ配置している
3. [サンプル](https://github.com/GincoInc/gew-client-sample-java/blob/master/src/main/java/grpc/example/ExampleMain.java#L21-L52) を参考にクライアントを生成、リクエストデータを構築してリクエストを行う

## Ref
* [grpc.io Java Tutorial](https://grpc.io/docs/languages/java/basics/) 