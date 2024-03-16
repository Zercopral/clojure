(def range_begin (atom 0))
(def range_end (atom 0))
(def guess (atom 0))

(defn start
  [begin end]
  (swap! range_begin begin)
  (swap! range_begin end)
  (println "Я готов..."))

(defn guess-my-number
  []
  (swap! guess (fn [left right] (+ left (/ (+ right left) 2))) (@range_begin @range_end))
  (println str (@guess)))

(defn smaller
  []
  (swap! range_end (@guess))
  (guess-my-number))

(defn bigger
  []
  (swap! range_begin (@guess))
  (guess-my-number))