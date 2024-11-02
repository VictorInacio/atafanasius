(ns atafanasius.core
  (:require [atafanasius.begin :as b])
  (:gen-class))

(defonce my-memory (atom nil))

(defn -main [&args]
  (println "This is a journey of hope and code!")
  (println b/first-message)
  (swap! my-memory (fn [a] {:your-name (b/introduction)}))
  (println "Hi!" (:your-name @my-memory)))

(comment
  (-main 0)
  )
