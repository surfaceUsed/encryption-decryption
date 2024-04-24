# encryption-decryption
Application for encryption/decryption of text input from command line

Hyperskill project (java developer). Stage 6/6

Application manipulates text input from command line, using the Caesar cipher.
    
The user inputs a text to be manipulated, and instructions on where to read the string from, where to print it too, and if the text shall
be encrypted or decrypted.
    
The user input gets maped to key-value pairs:
    
'-mode': defines the user input for either decrypting (dec) or encrypting (enc) a text string.
    
'-key': defines how many letter positions in the alphabet to shift to.
    
'-in': defines a file where the text to be encrypted/decrypted is to be read from.
    
'-out': defines a file to write the decrypted/encrypted text to.
    
'-data': the text to be encrypted/decrypted. If the command line input contains both '-data' and '-in' arguments, the program prefers '-data' 
over '-in'.
    
'-alg': defines what encrytpion/decryption algorithm to be used (shift or unicode).
    
Example: 

input from command line: "-mode enc -in road_to_treasure.txt -out protected.txt -key 5 -alg unicode".
    
The application reads the input from the file 'road_to_treasure.txt' and outputs the encrypted text to the file 'protected.txt':
    
Text read from input-file:'hello, how are you?'. Text written to output file: 'mjqqt1%mt|%fwj%~tzD'.
