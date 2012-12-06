(ns Day3.blogsamples)
; Refs

;create a reference
(ref "Mickey Mouse")

;assign the reference to a value
(def character (ref "Minnie Mouse"))

;get the reference back
character

;get the value of the reference using deref
(println(deref character))
;or shortened form @
@character

;trying to alter state outside of transaction
;(alter character str ": Mickey's girlfriend")
;IllegalStateException No transaction running  clojure.lang.LockingTransaction.getEx (LockingTransaction.java:208)

;running within transaction
(dosync (alter character str ": Mickey's girlfriend"))

;Atoms

;define an atom
(atom "Pride and Prejudice")

;bind to a variable
(def film (atom "Pride and Prejudice"))

;get atom back
film

;get value of atom back 
@film

;example of building a vector
(def top-sellers (atom []))
(swap! top-sellers conj {:title "Seven Languages", :author "Tate"})
(swap! top-sellers conj {:title "Programming Clojure" :author "Halloway"})

;Building an atom cache

; method to create an atom
; which references a map
(defn create
[]
(atom {}))

; method to retrieve a value by it's key
; takes in the cache and key
; gets the map referenced by the atom and retrieves the appropriate value
(defn get-item
[cache key]
(@cache key))

; method to add atom to cache
; the merge version add all the associations in a map to the cache
; the assoc adds an individual key/value to the cache
(defn put-item
([cache value-map]
(swap! cache merge value-map))
([cache key value]
(swap! cache assoc key value)))
  
(def mycache (create))
(put-item mycache {:pig "oink oink", :cow "moo moo"})
(put-item mycache :duck "quack quack")
(println (str "The cow goes " (get-item mycache :cow)))
; Outputs "The cow goes moo moo"

;agents
; define a function which squares a value
(defn squares [x] (* x x))

;define an agent called test-agent which has an initial value of 2 
(def test-agent (agent 2))

;mutate test by sending the agent a value
;the function squares will run in another thread
(send test-agent squares)

@test-agent
; returns 4

;Futures

(def finer-things (future (Thread/sleep 5000) "take time"))

@finer-things
;"take time"



