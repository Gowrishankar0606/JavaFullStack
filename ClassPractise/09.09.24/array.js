var a=['first','second','third'];
console.log("My first:",a)

var a1=['first','second','third'];
var positiona=a1.indexOf("second");
console.log("a1:",a1);
console.log("position:",positiona);

var a1=['first','second','third'];
var position2=1;
var elementToRemove=2;
a.splice(position2,elementToRemove);
console.log("Modified array",a);

var gs=['a','b','c','d','e','z,','x','y','p','g','s','h'];
var b=[2,6,4,7,9,8,1];
gs.sort();
console.log("a:",gs);
b.sort();
console.log("b:",b);


var a8=[1,2];
a8.push(4);
console.log("The added element is:",a8);


var a9=["one","two","three","four","five"];
a9.pop("two");
console.log("The deleted element is:",a9);

var a10=[1,2,4,6,7,8,9,20];
for(var e of a10)
{
    console.log("The iterated array:",e);
}


//array of objects (=> value and key based pairs)

var car={

    "color":"pink",
    "type":"sedan",
    "model":"Audi",
    "year":2024
}

console.log("The properties of car",car)


var a11=["One","two","Three","Four"];
console.log("The value of a is",a11);
var removed=a11.shift();// shift is used to remove an element from the front of the array
console.log("The removed value is ",removed);

var a12=["One","two","Three","Four"];
console.log("The value of a12:",a12);
a12.unshift("Zero");
console.log("added value is:",a12);
