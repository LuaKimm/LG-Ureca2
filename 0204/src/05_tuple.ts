/*
tuple
다양한 타입에 데이터를 배열형태로 유지

변수명: [타입, 타입, ...]=[값,값,...] //값의 개수는 선언한 타입의 개수와 순서가 동일해야한다. 
*/

const myTuple:readonly[string, number] = ['kdg',37];
console.log('myTuple:', myTuple);
//myTuple.push('kkkkk') 
//readonly가 없다면 데이터를 추가 할 수 있다. 그러나 튜플의 목적에 맞지 않음

//함수에서 튜플을 이자로 받을 수 있다.
function printMyTuple(name:string, info:[string, number]):void{
console.log(`[${name}]`, ...info)
}

printMyTuple('튜플테스트', myTuple)


//튜플을 반환하는 함수
function fetchUser():[string, number]{
  return ['uplus',2]
}

console.log(fetchUser());
let returnTuple = fetchUser();
console.log(returnTuple)

//튜플의 결과값을 분해해서 받을 수 있음
const[nameT, ageT] = fetchUser();
console.log(`name: ${nameT}, age: ${ageT} `);