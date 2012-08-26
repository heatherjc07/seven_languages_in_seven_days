#Find out how to access files with and without code blocks. 
#What is the benefit of the code block?

#When you use a code block, e.g. to write to a file, Ruby closes the file without you needing to explicitly ask it to.
#it guarantees that the file will be closed, even if executing the block results in an exception.

file = File.open("example.txt", "w")
file.puts "accessing without a code block"
file.close

File.open("example2.txt", "w") do |f| 
  f << 'accessing with a block' 
end 

#How would you translate a hash to an array? 
p "translating a hash to an array"
h = { "dog" => "woof", "cat" => "meow", "pig" => "oink", "cow" => "moo"  }
p "our hash:"
p h
a = h.to_a
p "the array it creates:"
p a

#Can you translate arrays to hashes?
p "translating an array to a hash"
animal_array = [["dog","woof"],["cat","meow"],["pig","oink"],["cow","moo"]]
p "our array:"
p animal_array
animal_hash = Hash[animal_array]
p "the hash it creates: "
p animal_hash

#Can you iterate through a hash?
p "Example of iterating through a hash"
h.each {|key, value| puts "#{key} makes a #{value} noise" }

#You can use Ruby arrays as stacks. What other common data structures do arrays support?
example = [1,2,3,4]
#queue
p "Using an array as a queue"
p "unshift"
p example.unshift(0)
p "shift"
p example.shift

#linked list
p "Using an array as a linked list"
#stack
p "Using an array as a stack"
p "push"
p example.push(5)
p "pop"
p example.pop
#set
p "Using an array as a set"
orig = [1,1,1,2,3,3,4,5]
p orig
p orig.uniq

