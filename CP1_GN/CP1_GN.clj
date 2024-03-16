;; (load-file "CP1_GN/CP1_GN.clj")
;; (start 1 100)
;; (guess-my-number)
;; (smaller)
;; (bigger)

(def range_begin (atom 0))
(def range_end (atom 0))
(def guess (atom 0))

(defn guess-my-number
  []
  (swap! guess (fn [_] (+ @range_begin (int (/ (- @range_end @range_begin) 2)))))
  @guess)

(defn smaller
  []
  (swap! range_end (fn [_] @guess))
  (guess-my-number))

(defn bigger
  []
  (swap! range_begin (fn [_] @guess))
  (guess-my-number))

(defn start
  [begin end]
  (swap! range_begin (fn [_] begin))
  (swap! range_end (fn [_] end))
  "Я готов...")