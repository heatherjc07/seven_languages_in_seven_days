(6 / 0) println // inf
(2 / 4) println // 0.5

Number origDivision := Number getSlot("/")
Number / := method(other,   if (other == 0, 0, self origDivision(other)))

(6 / 0) println // 0
(2 / 4) println // 0.5