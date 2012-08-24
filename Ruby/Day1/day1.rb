#The Ruby API
#http://www.ruby-doc.org/core-1.9.3/

#Programming Ruby: The Pragmatic Programmer’s Guide
#http://ruby-doc.org/docs/ProgrammingRuby/

#A method that substitutes part of a string
puts "HOG".gsub "G", "TDOG"

#Information about Ruby’s regular expressions
#http://www.ruby-doc.org/core-1.9.3/Regexp.html

#Information about Ruby's ranges
#http://www.ruby-doc.org/core-1.9.3/Range.html

#Print the string 'Hello, world.'
p 'Hello, world.'

#For the string 'Hello, Ruby' find the index of the word 'Ruby'
p "Hello, Ruby".index "Ruby"

#Print your name ten times.
10.times {puts "Heather"}
# or
puts "Heather " * 10

#Print the string 'This is sentence number 1.' where the number 1 changes from 1 to 10.
(1..10).each { |num| puts "This is sentence number #{num}" }

#Run a Ruby program from a file.
#ruby day1.rb