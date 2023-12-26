// console.log('Hello Bitch')
// alert('Thevidiya')
// let score=0;
// score=10.5
// score='no one'          // JS is dynamically type language
// console.log(score)

// let name=prompt("What your name");       
// console.log(name)

// let value=prompt("whats the value")
// console.log("The value is ",(Number(value)*10));


// let firstName="Anand";
// let lastName="Prabhakaran";
// let city="Salem";
//console.log(firstName+" "+lastName+ " Lives in "+city);

        // now using template literals
        // backtick
// let msg=`${firstName} ${lastName} Lives in ${city}`;
// console.log(msg);

// msg=`hi
// Bro
// Hello`
// console.log(msg);
// console.log(`My dog's name is "doggy style"`)



// let cities=["Anand","Bharath","Sharath","Vimal"]
// cities.push("Sakthi")
// console.log(cities)
// cities[0]="Hi";
// console.log(cities[cities.length-1])

// let arr=[1,2,'S',"Anand",['1',2]]
// console.log(arr[4][1])
// console.log(typeof arr)

//let matrix=[[1,2,3,4],[4,5,6,7],[7,8,9,10]]
//console.log(matrix.length)      // rows length
//console.log(matrix[0].length)      // columns length

// let array=['a','b','c','d','e']
// console.log(array.push('f'))        // adds in last and return the new length of array
// console.log(array.pop())        // removes last element
// console.log(array.shift())      // removes first element
// console.log(array.unshift('a'))     // adds in first and return the new length of array
// delete array[2]

// array.splice(2,1)       //starts from 2nd and from delete 1 element
// console.log(array)
// array.splice(2,1,'x')
// array.splice(3,0,'w')
// console.log(array)
// array.reverse()
// let str=array.join()
// console.log(str)
// let str1="1,2,3,4"
// let s=str1.split(",")
// console.log(s)



let first=[1,2,3,4]
let second=[5,6,7,8,9]
// let joined=first.concat(second)      // concat function
// console.log(joined)

let joined=[...first,...second]     //spread operator
console.log(joined)