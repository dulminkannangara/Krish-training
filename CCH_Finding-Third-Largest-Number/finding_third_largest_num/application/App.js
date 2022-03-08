const  sortJS = require("./model/My_bubble_sort");

const pc = require("prompt-sync");
const prompt = pc();

console.log("\n~ ~ ~ ~ ~ ~ Finding 3rd Largest Number ~ ~ ~ ~ ~ ~\n");
let sequence = prompt("Enter Number Sequence (Ex : 12,13,23,10) : ");

let arr = sortJS.sort(sequence);
if(arr==null){
    console.log("Invalid Number sequence");
}

while (arr==null){
    sequence = prompt("Enter Number Sequence again (Ex : 12,13,23,10) :");
    arr = sortJS.sort(sequence);
    if(arr !=null){
        break;
    }
    console.log("\nInvalid Number sequence");
}

console.log("~ ~ ~ Answer ~ ~ ~");
console.log("3rd largest number is "+arr[arr.length-3]);
