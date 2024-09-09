var objarr=[
    {
        empname:"GS",
        age:22,
        gender:"Male"
    },
    {
        empname:"SG",
        age:23,
        gender:"Female"
    }

];

//arrow functions(=>big arrow)
//1.Arrow function withpout parameter

const sla=()=>
{
    console.log("welcome");
}
sla();

//2.arrow function with single parameter

const s=x=>x*x;
console.log(s(5));

//3. arrow function with multiple parameter

const s1=(x1,y1,z1)=>
{
    console.log(x1+y1+z1);
}
    s1(10,20,30);

    //4. default parameter

    const s4=(x4,y4,z4=30)=>
    {
        console.log(x4+""+y4+""+z4);
    }
    s4(10,20);

var search =objarr.filter(item=>item.empname==="GS");
console.log(search);

console.log(objarr[0].age);
console.log(objarr[1].gender);

objarr.map((item)=>{
    console.log(item);
})
