(ns Day3.core)
(def accounts (ref []))

(defn add-account [accounts number balance]
  (alter accounts conj { :number number, :balance balance})
 
)

;http://stackoverflow.com/questions/7051643/vector-of-maps-processing-in-clojure
; how to process a map of vectors
(defn debit-account [accounts number amount]
  (map   ; apply the given function to every element in the collection
    (fn [acc]
      (if(= (:number acc) number)
        (assoc
         acc
         :balance
         (- (:balance acc) amount)
        )
       acc
      )
    )
   accounts)   
)

(defn credit-account [accounts number amount]
  (map   ; apply the given function to every element in the collection
    (fn [acc]
      (if(= (:number acc) number)
        (assoc
         acc
         :balance
         (+ (:balance acc) amount)
        )
       acc
      )
    )
   accounts)   
)

;testing it out
(dosync
  (add-account accounts 1111111 100.00)
  (add-account accounts 2222222 10.00)
  (alter accounts debit-account 1111111 50)
   (alter accounts debit-account 2222222 50)
   (alter accounts credit-account 2222222 75.50)
  (println @accounts)
)

  