# bootstrapped-cljs-practice
A project for my practice about bootstrapped clojurescript.

# Setup
## lumo
Install [lumo](https://github.com/anmonteiro/lumo).

## dependencies
```
npm install
```
# Run
## Hello world
```
lumo -c src -m hello-world.core
```

## Express sample app
```
lumo -c src -m express-sample.core
```

Then access to http://localhost:3000

# Build
## Hello world
```
lumo -c src build_hello_world.cljs
```
Then
```
node index_hello_world.js
```

## Express sample app
```
lumo -c src build_express_sample.cljs
```
Then
```
node index_express_sample.cljs
```

# References
- [lumo-npm-example](https://github.com/rberger/lumo-npm-example)
- [express hello world example](https://expressjs.com/en/starter/hello-world.html)
- [Compiling ClojureScript Projects Without the JVM](https://anmonteiro.com/2017/02/compiling-clojurescript-projects-without-the-jvm/)
- [lumo（javaに依存しないclojurescriptビルドツール）でnodejsアプリを作る方法](http://asukiaaa.blogspot.com/2017/08/lumojavaclojurescriptnodejs.html)
