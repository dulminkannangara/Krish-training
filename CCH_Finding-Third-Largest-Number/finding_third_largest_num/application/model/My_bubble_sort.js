
function sort(test_arr) {
    let arr = getIntArr(test_arr);
    if (arr == null) {
        return arr;
    }
    let length = arr.length;
    let temp = 0;
    let zero_count = 0;
    // console.log(arr);
    for (let i = 0; i < length - 1; i++) {
        for (let j = 0; j < length - 1 - i; j++) {
            if(arr[j].length != arr[j+1].length){
                if(arr[j].length > arr[j+1].length){
                    zero_count = arr[j].length - arr[j+1].length;
                    for (let x = 0; x<zero_count; x++){
                        arr[j+1] = "0"+arr[j+1]
                    }
                }else if(arr[j].length < arr[j+1].length){
                    zero_count = arr[j+1].length - arr[j].length;
                    for (let x = 0; x<zero_count; x++){
                        arr[j] = "0"+arr[j]
                    }
                }
            }
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

    }
    // console.log(arr);
    return arr;
}

function getIntArr(test) {

    let splityArr = test.split(",");
    let arr = null;
    if (splityArr.length < 3) {
        console.log("\nThe sequence must have more than three numbers");
        return arr;
    }
    arr = new Array(splityArr.length);
    for (let i = 0; i < splityArr.length; i++) {

        try {
            arr[i] = splityArr[i];
        } catch (exception) {
            arr = null;
            break;
        }
    }
    return arr;
}

module.exports = {sort};