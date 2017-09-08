# bootstrapped-cljs-practice
A project for my practice about bootstrapped clojurescript.

# Setup
Install nodejs to your pc.

## lumo
```
sudo npm i -g lumo-cljs
```

or

```
sudo npm i -g lumo-cljs --unsafe-parm
```

[lumo](https://github.com/anmonteiro/lumo).

## calvin
```
sudo npm i -g calvin-cljs
```

[calvin](https://github.com/eginez/calvin).

## Download node dependencies
```
npm install
```

## Download cljs dependencies
Dependencies were written on [project.clj](/project.clj).

```
calvin repl
```

# Run
## Hello world
```
calvin repl -c src -m hello-world.core
```

## Express sample app
```
calvin repl -c src -m express-sample.core
```

Then access to http://localhost:3000

# Build
Build configuration was written on [project.clj](/project.clj).

## Hello world
```
calvin build dev-hello-world
```
Then
```
node out/main-hello-world.js
```

## Express sample app
```
calvin build dev
```
Then
```
node out/main-express-sample.js
```

# References
- [lumo-npm-example](https://github.com/rberger/lumo-npm-example)
- [express hello world example](https://expressjs.com/en/starter/hello-world.html)
- [Compiling ClojureScript Projects Without the JVM](https://anmonteiro.com/2017/02/compiling-clojurescript-projects-without-the-jvm/)
- [lumo（javaに依存しないclojurescriptビルドツール）でnodejsアプリを作る方法](http://asukiaaa.blogspot.com/2017/08/lumojavaclojurescriptnodejs.html)
- [calvinを使ってhiccupを利用したnodejsアプリを作る方法](http://asukiaaa.blogspot.com/2017/09/calvinhiccupnodejs.html)
