(ns eu.someorg.proj1-base.core
  (:gen-class)
  (:require [eu.someorg.comp1.interface :refer [showit]]))

(defn -main [& _args]
  (showit))
  