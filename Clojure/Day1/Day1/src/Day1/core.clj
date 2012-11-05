(ns Day1.core)

;http://faustus.webatu.com/clj-quick-ref.html
;found a list of type tests
; cond is like a switch statement and allows you to check multiple conditions
(defn
 collection-type
[col]
(cond
 (list? col) :list
 (map? col) :map
 (vector? col) :vector
))

(def AVector [:luke :lucy :lynne])
(def AList '(:luke :lucy :lynne))
(def AMap {:chewie :wookie, :lea :human})

(println "expect vector:" (collection-type AVector))
(println "expect list:" (collection-type AList))
(println "expect map:" (collection-type AMap))

(defn bigstn
"Returns true if string is longer than n chars"
[string n]
( > (count string) n))

(println "expect true: " (bigstn "heather" 3))
(println "expect false: " (bigstn "dog" 4))