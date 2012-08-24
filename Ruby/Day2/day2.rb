#Find out how to access files with and without code blocks. 
#What is the benefit of the code block?

#When you use a code block, e.g. to write to a file, Ruby closes the file without you needing to explicitly ask it to.
#it guarantees that the file will be closed, even if executing the block results in an exception.