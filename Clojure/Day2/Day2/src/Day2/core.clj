(ns Day2.core)


; lazy sequences
(def factorials (reductions * (iterate inc 1))) 

(println (take 5 factorials))   
 
(def sum (reductions + (iterate inc 1)))

(println (take 5 sum))


; unless else sequence
(defmacro unless-else [test ifbody elsebody]
(list 'if (list 'not test) ifbody elsebody))

(unless-else false (println "unless body") (println "else body"))
(unless-else true (println "unless body") (println "else body"))

; defining a protocol and a record
(ns com.campbell)
 
(defprotocol Fulfillment
 (invoice [this] "Returns an invoice")
 (manifest [this] "Returns a shipping manifest"))
 
(defrecord Product [name price])
 
(def pencil (Product. "Pencil" 30))
(println (:name pencil))
(println (:price pencil))
 
(def pen (Product. "Pen" 150))
(println (:name pen))
(println (:price pen))

(defn current-time [] 
  (. (new java.util.Date) (toString))) 


(def products {pen 1, pencil 5})

 
(defrecord PurchaseOrder [date customer products]
 Fulfillment
 (invoice [this]
 (format "Invoice for %s \nDate %s" customer date))
 (manifest [this]
 (str "Shipping to " customer)))
 
(def po (PurchaseOrder. (current-time)
 "Heather Campbell"
 products))

(println(:date po))
(println(:customer po))
(println(:products po))
(println (invoice po))
(println (manifest po))

(defn format-products [products]
   (println Product \tQuantity)
)
(format-products products)





