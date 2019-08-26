var date=new Date();
document.write(date);
document.write("<br/>");
document.write(date.getMonth()+1);
document.write("<br/>");
document.write(date.getFullYear());
document.write("<br/>");
document.write(date.getDate());
document.write("<br/>");
document.write(date.getHours());

var string1= "All States States";
document.write(string1);
document.write(string1.lastIndexOf('S'));
document.write("<br>");
document.write(string1.indexOf('S'));
document.write("<br>");
var s1=string1.substring(2,4);
document.write(s1);
document.write("<br>");
document.write(string1.search('Sta'));
document.write("<br>");

var arr1= ["Banana","Mango","Grapes","WaterMelon"];
document.write("<br>");
document.write(arr1[0]);
document.write("<br>");
document.write(arr1.toString());
document.write("<br>");
document.write(arr1.join("-"));
document.write(arr1.pop());//remove
document.write(arr1.push("kiwi"));//add
document.write("<br>");

var num1=567.89;
document.write("<br>");
document.write(num1);



function clickevent(){
	var x=prompt("do you want to allow");
	//document.getElementById("p1").innerHTML= x;
	//var n=document.getElementsByTagName('span');
	var m=document.getElementsByClassName('s1');
	//document.write(m);
	var i=0;
	while(i<m.length){
	//m[i].innerHTML= x;
	//document.write(x);
	if(x === 3)
	{
		document.getElementById('p2').innerHTML = x;
		}
	i++;
	}
	}
	
	function first(){
		alert("first called");
	}
	
	function second(){
	alert("second called");
	}