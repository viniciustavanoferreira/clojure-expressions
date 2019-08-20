;; Creating a function.
(defn square
    [x]
    (* x x))
(square 10)

;; Print some text.
(println "REPL is great!")

;; Calling Clojure libs from the REPL.
(require '[clojure.string])
(clojure.string/upper-case "repl is great!")

(require '[clojure.string :as cstr])
(cstr/upper-case "repl is great!")

(require '[clojure.string :refer [upper-case]])
(upper-case "repl is great!")

(require '[clojure.java.javadoc :as jdoc])
(jdoc/javadoc #"a+")
(jdoc/javadoc java.util.regex.Pattern)

;; Binding symbols to values with let, where the symbol is
;;only resolved inside the let.
(let [l "here"] (println (str "Hey, I'm " l)))

;; Binding symbols to values with def, where is possible
;;to access the symbol from anywhere.
(def a "Test def")
(println a)

;; Creating a function.
(defn say-something
      [something]
      (println (str "Say: " something)))
(say-something "hey")


