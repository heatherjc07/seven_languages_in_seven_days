(ns Day1.blogsamples)


(println (+ 1 1))
;2
(println (* 10 10))
; 100

(println (/ 1 3))
; 1/3

(println (class (/ 1 3)))
; clojure.lang.Ratio

(println (/ (/ 12 2) (/ 6 2)))
; 2

(println (< 1 2 3))
; true
(println (< 1 3 2 4))
; false

(println (str "one: " 1 " two: " 2))
; "one: 1 two: 2"

(println (if (> 5 2) (println "True") (println "False")))
; True

;LISTS

(list 1 2 3)
; (1 2 3)
'(1 2 3)
; (1 2 3)

;get first element
(println (first '("banana" "apple" "pear")))
; "banana"

;get last element
(println (last '("banana" "apple" "pear")))
; "pear"

;get list minus the head
(println (rest '("banana" "apple" "pear")))
; ("apple" "pear")

;construct a new list given a head and tail
(println (cons "kiwi" '("banana" "apple" "pear")))
; ("kiwi" "banana" "apple" "pear")
                   
;VECTORS

[:monday :sunday :friday]
; [:monday :sunday :friday]

; get the first element
(println (first [:monday :sunday :friday]))
; :monday

; get the element at position 2
(println (nth [:monday :sunday :friday] 2))
; :friday

; get the element at position 0
(println (nth [:monday :sunday :friday] 0))
; :monday

; get the last element
(println (last [:monday :sunday :friday]))
; :friday

; get the element at index 2
(println ([:monday :sunday :friday] 2))
; :friday

;get the first element
(println (first [:monday :sunday :friday]))
:monday 

;get the rest of the vector minus the head
(println (rest [:monday :sunday :friday]))
;(:sunday :friday)

; combining vectors
(println (concat [:pig] [:cow]))
; (:pig :cow)

;SETS!!!

(def animals #{:dog :cat :pig})

(println animals)
; #{:dog :cat :pig}

; count the number of elements in the set
(println (count animals))
; 3

;sort the set
(println (sort animals))
;(:cat :dog :pig)

;merge sets
(println (clojure.set/union #{:black} #{:white}))
;#{:black :white}

;determine difference
(println (clojure.set/difference #{1 2 3} #{2}))
; #{1 3}

(println (sorted-set 4 9 2))
#{2 4 9}

; MAPS

{:dumbo :elephant :snoopy :dog}
; {:dumbo :elephant, :snoopy :dog}

{:france "Paris", :ireland "Dublin"}
; {:france "Paris", :ireland "Dublin"}

(println (merge {:france "Paris", :ireland "Dublin"} {:norway "Oslo"}))
; {:france "Paris", :ireland "Dublin", :norway "Oslo"}

; define a map called capitals
(def capitals {:france "Paris", :ireland "Dublin"})
capitals
; {:france "Paris", :ireland "Dublin"}

;retrieve a value by passing in the key
(println (capitals :ireland))
; "Dublin"

(println (:ireland capitals))
; "Dublin"
         
(defn force-it
"The first function a young Jedi needs"
[jedi]
(str "Use the force," jedi))

(println (force-it "Luke"))
; "Use the force,Luke"


(def board [[:x :o :x] [:o :x :o] [:o :x :o]])

(defn center [[_ [_ c _] _]] c)

(println (center board))
; :x

(defn center2 [[_ [_ c]]] c)

(println (center2 board))
; :x

(defn center3 [board]
(let [[_ [_ c]] board] c))

(println (center3 board))
; :x

(def person {:name "Heather" :profession "Developer"})

(println (let [{name :name} person] (str "The person's name is " name)))
; "The person's name is Heather"

(def people ["David Coulthard", "Damon Hill"])

(println (map count people))
; (15 10)

(println (map (fn [w] (* 2 (count w))) people))
; (30 20)

(println (map #(* 2 (count %)) people))
; (30 20)

(def v [3 1 2])
(println (apply + v))
;6

(println (apply max v))
;3

(def v [3 1 2])
(println (filter odd? v))
;(3 1)

(println (filter #(< % 3) v))
;(1 2)