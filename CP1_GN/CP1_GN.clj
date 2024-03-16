;; (load-file "CP1_GN/CP1_GN.clj")

(:require [clojure.math.numeric-tower :as math])

(def range_begin (atom 0))
(def range_end (atom 0))
(def guess (atom 0))

(defn start
  [begin end]
  ;; (println (str(+ begin end)))
  ;; (let [r_begin (Integer/parseInt begin), r_end (Integer/parseInt end)]
  
  ;; )
  (swap! range_begin (fn [_] begin))
  (swap! range_end (fn [_] end))
  "Я готов...")

(defn calc_guess [_]
;;   (let [temp (- @range_end @range_begin)]
;;     (if (odd? temp)
;;       (- (+ @range_begin (/ (+ temp 1) 2) 1))
;;       (+ @range_begin (/ temp 2)))
;; ))
(+ @range_begin (/ (round (- @range_end @range_begin)) 2))
)

(defn guess-my-number
  []
  (swap! guess calc_guess);;(fn [left right] ) (@range_begin @range_end))
  @guess)

(defn smaller
  []
  (swap! range_end (fn [_] @guess))
  (guess-my-number))

(defn bigger
  []
  (swap! range_begin (fn [_] @guess))
  (guess-my-number))