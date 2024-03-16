(defn to-part [recp]  (str "Уважаемый" recp "!/n"))
(defn from-part [author] (str "С уважением, " author))
(defn body-part [title] (str "Спасибо, что посетили мой курс " title ".\n"))
(defn create-email 
  [rec title auth])