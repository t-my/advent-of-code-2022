(ns day-1.core
  (:require [clojure.string :as str]))

(defn split-to-groups [delimiter str] (str/split str delimiter))

(defn split-by-newline [str] (map #(str/split % #"\n") str))

(->>
 (slurp "src/day_1/input.txt")
 (split-to-groups #"\n\n")
 (split-by-newline)
 (map #(map read-string %))
 (map #(reduce + %))
 (sort)
 (reverse)
 (take 3)
 (reduce +))