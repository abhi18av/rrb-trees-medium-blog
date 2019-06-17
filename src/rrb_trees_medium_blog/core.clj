(ns rrb-trees-medium-blog.core
(:require [criterium.core :as criterium]))


(criterium/bench (Thread/sleep 1000))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
