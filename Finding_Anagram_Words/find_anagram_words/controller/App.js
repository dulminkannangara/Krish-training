const my_sort_algo = require("./model/MyBubbleSort");

const pc = require("prompt-sync");
const  prompt = pc();

console.log("\n~ ~ ~ ~ ~ ~ Find Anagram Words ~ ~ ~ ~ ~ ~\n\n")
let first_word = prompt("Enter first word : ");
let second_word = prompt("Enter second word : ");

console.log("\n~ ~ ~ ~ Answer ~ ~ ~ ~");
if(my_sort_algo.sorting(first_word)===my_sort_algo.sorting(second_word)){
    console.log("These two words are anagram words");
}else {
    console.log("These two words are not anagram words");
}



