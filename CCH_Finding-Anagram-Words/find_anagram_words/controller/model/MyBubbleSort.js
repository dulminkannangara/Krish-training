function sorting(word) {
    word = word.toLowerCase();
    let letter_array = Array.from(word);
    let temp;
    for (let i = 0; i<letter_array.length-1; i++){
        for (let j =0; j<letter_array.length-1-i;j++){
            if (letter_array[j]>letter_array[j+1]){
                temp = letter_array[j];
                letter_array[j] = letter_array[j+1];
                letter_array[j+1] = temp;
            }
        }
    }
    return letter_array.toString();
}
module.exports = {sorting};